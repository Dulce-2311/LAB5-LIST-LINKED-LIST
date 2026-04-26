package Ejercicioss.E_04_contarNodos;

import estructuras.ListLinked;

public class MainContar {

    public static void main(String[] args) {

        ListLinked<Integer> lista = new ListLinked<>();

        lista.insertLast(5);
        lista.insertLast(10);
        lista.insertLast(20);

        System.out.println("Lista:");
        lista.print();

        int total = ContarNodos.contarNodos(lista);

        System.out.println("Cantidad de nodos: " + total);
    }
}