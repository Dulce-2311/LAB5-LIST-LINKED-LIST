package E_02_invertirLista;

import estructuras.ListLinked;
import estructuras.Node;

public class InvertirLista {

    public static <T> ListLinked<T> invertirLista(ListLinked<T> lista) {

        ListLinked<T> nueva = new ListLinked<>();

        Node<T> actual = lista.getFirst();

        while (actual != null) {
            nueva.insertFirst(actual.value);
            actual = actual.next;
        }

        return nueva;
    }
}
