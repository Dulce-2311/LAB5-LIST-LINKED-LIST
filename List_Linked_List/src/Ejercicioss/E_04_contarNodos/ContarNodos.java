package E_04_contarNodos;

import estructuras.ListLinked;
import estructuras.Node;

public class ContarNodos {

    public static <T> int contarNodos(ListLinked<T> lista) {

        int contador = 0;

        Node<T> actual = lista.getFirst();

        while (actual != null) {
            contador++;
            actual = actual.next;
        }

        return contador;
    }
}