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
    }
}
