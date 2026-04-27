package E_02_invertirLista;

import estructuras.ListLinked;

public class MainInvertir {

    public static void main(String[] args) {

        ListLinked<Integer> lista = new ListLinked<>();

        lista.insertLast(5);
        lista.insertLast(10);   
        lista.insertLast(20);

        System.out.println("Lista original:");
        lista.print();

        ListLinked<Integer> invertida = InvertirLista.invertirLista(lista);

        System.out.println("Lista invertida:");
        invertida.print();
    }
}