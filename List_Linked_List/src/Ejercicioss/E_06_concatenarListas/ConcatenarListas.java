package E_06_concatenarListas;

import estructuras.ListLinked;
import estructuras.Node;

public class ConcatenarListas {

    public static <T> ListLinked<T> concatenarListas(ListLinked<T> lista1, ListLinked<T> lista2) {
        ListLinked<T> nueva = new ListLinked<>();
        
        // Recorremos la primera lista
        Node<T> actual = lista1.getFirst();
        while (actual != null) {
            nueva.insertLast(actual.value);
            actual = actual.next;
        }
        
        // Recorremos la segunda lista
        actual = lista2.getFirst();
        while (actual != null) {
            nueva.insertLast(actual.value);
            actual = actual.next;
        }

        return nueva;
    }
}