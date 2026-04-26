package Ejercicioss.E_06_concatenarListas;

import estructuras.ListLinked;

public class MainConcatenar {

    public static void main(String[] args) {
        ListLinked<Integer> lista1 = new ListLinked<>();
        lista1.insertLast(1);
        lista1.insertLast(2);
        lista1.insertLast(3);

        ListLinked<Integer> lista2 = new ListLinked<>();
        lista2.insertLast(4);
        lista2.insertLast(5);
        lista2.insertLast(6);

        ListLinked<Integer> listaConcatenada = ConcatenarListas.concatenarListas(lista1, lista2);

        System.out.println("Lista 1:");
        lista1.print();

        System.out.println("Lista 2:");
        lista2.print();

        System.out.println("Lista Concatenada:");
        listaConcatenada.print();
    }
}
