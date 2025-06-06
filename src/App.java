import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        // -------------------- Stack simple ----------------------------
        Stack stack = new Stack();

        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);

        System.out.println("Tam = " + stack.size());
        stack.printStack();

        stack.pop();
        stack.peek();

        System.out.println("Tam = " + stack.size());
        stack.printStack();

        // -------------------- Stack genérica ---------------------------
        StackG<Integer> stackGint = new StackG<>();
        stackGint.push(1);
        stackGint.push(4);
        stackGint.printStack();

        StackG<String> stackGStrinG = new StackG<>();
        stackGStrinG.push("Uno");
        stackGStrinG.push("Cuatro");
        stackGStrinG.printStack();

        // -------------------- Cola simple -------------------------------
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("tam = " + cola.getSize());
        cola.printCola();
        cola.remove();
        System.out.println("tam = " + cola.getSize());
        cola.printCola();

        // --------------------- Cola genérica con Persona ----------------------
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);

        System.out.println("Tamaño de colaPersonas = " + colaPersonas.getSize());
        colaPersonas.printCola();

        System.out.println("Atiende a la persona => " + colaPersonas.remove());
        System.out.println("Tamaño de colaPersonas = " + colaPersonas.getSize());
        colaPersonas.printCola();

        // --------------------- Buscar y eliminar por nombre ----------------------
        Persona pEliminada = colaPersonas.removeByName("David");

        if (pEliminada != null) {
            System.out.println("Persona eliminada => " + pEliminada);
        } else {
            System.out.println("No se encontró a la persona con ese nombre.");
        }

        System.out.println("Cola actualizada:");
        colaPersonas.printCola();

        // ------------------ Ejercicio 01: Validación de signos ------------------
        System.out.println("\nEJERCICIO 01: Validación de signos");
        String input1 = "([]){}";
        String input2 = "({)}";
        System.out.println(input1 + " => " + Ejercicio_01_sign.SignValidator.isValid(input1)); // true
        System.out.println(input2 + " => " + Ejercicio_01_sign.SignValidator.isValid(input2)); // false


        // ------------------ EJERCICIO 02: Ordenar Stack ------------------
        System.out.println("\nEJERCICIO 02: Ordenar Stack");

        java.util.Stack<Integer> desordenado = new java.util.Stack<>();
        desordenado.push(5);
        desordenado.push(1);
        desordenado.push(4);
        desordenado.push(2);

        System.out.println("Original: " + desordenado);

        // Ordenar con pila auxiliar
        java.util.Stack<Integer> ordenado = new java.util.Stack<>();
        while (!desordenado.isEmpty()) {
            int temp = desordenado.pop();
            while (!ordenado.isEmpty() && ordenado.peek() > temp) {
                desordenado.push(ordenado.pop());
            }   
        ordenado.push(temp);
        }

        System.out.println("Ordenado: " + ordenado);
    }
}
