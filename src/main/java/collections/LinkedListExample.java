package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {


        //LinkedList: Analogo a una lista, puedes acceder tanto al siguiente elemento como al anterior

        List<String> listaEnlazada = new LinkedList<>();

        listaEnlazada.add("Victor");
        listaEnlazada.add("Violeta");
        listaEnlazada.add("Victor Manuel");
        listaEnlazada.add("Veronica");

        System.out.println(listaEnlazada);

        listaEnlazada.add(1, "Alejandro");

        System.out.println(listaEnlazada);

        listaEnlazada.addFirst("Araceli");

        System.out.println(listaEnlazada);

        listaEnlazada.addLast("Victoria");

        System.out.println(listaEnlazada);



    }
}
