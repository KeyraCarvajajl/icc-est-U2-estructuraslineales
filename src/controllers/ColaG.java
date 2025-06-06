package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;
import models.Persona;

public class ColaG<T> {

    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG() {
        primero = null;
        ultimo = null;
        size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> nuevo = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setNext(nuevo);
            ultimo = nuevo;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) throw new EmptyStackException();
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int getSize() {
        return size;
    }

    public void printCola() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.print(current.getValue() + " | ");
            current = current.getNext();
        }
        System.out.println();
    }

    public Persona removeByName(String nombre) {
    if (isEmpty()) return null;

    // Si la persona a eliminar está al inicio
    if (((Persona) primero.getValue()).getNombre().equalsIgnoreCase(nombre)) {
        Persona eliminada = (Persona) primero.getValue();
        primero = primero.getNext();
        size--;
        return eliminada;
    }

    // Buscar en el resto
    NodeGeneric<T> actual = primero;
    while (actual.getNext() != null) {
        Persona siguiente = (Persona) actual.getNext().getValue();
        if (siguiente.getNombre().equalsIgnoreCase(nombre)) {
            Persona eliminada = siguiente;
            actual.setNext(actual.getNext().getNext());
            size--;
            return eliminada;
        }
        actual = actual.getNext();
    }

    return null; // no se encontró
    }

}