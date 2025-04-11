package collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> pila = new Stack<>();

        pila.push("Victor");
        pila.push("Veronica");
        pila.push("Violeta");
        pila.push("Victor Manuel");

        System.out.println(pila);

        System.out.println("El que esta al principio de todo es "+pila.peek());

        pila.pop();

        System.out.println(pila);

        System.out.println("El que esta al principio de todo es "+pila.peek());
    }
}
