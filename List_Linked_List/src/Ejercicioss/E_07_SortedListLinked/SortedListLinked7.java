package E_07_SortedListLinked;

// clase nodo
class Node7<T> {
    T value;
    Node7<T> next;

    public Node7(T value) {
        this.value = value;
        this.next = null; // no apunta a nada al inicio
    }
}


// lista base
class ListLinked7<T> {

    protected Node7<T> first; // uso protected para que la clase hija pueda acceder

    public ListLinked7() {
        first = null; // lista vacía
    }

    public Node7<T> getFirst() {
        return first;
    }

    public void setFirst(Node7<T> node) {
        this.first = node;
    }
}


// clase ordenada (LO QUE PIDE EL EJERCICIO)
public class SortedListLinked7<T extends Comparable<T>> extends ListLinked7<T> {

    public void insertOrden(T x) {

        Node7<T> nuevo = new Node7<>(x); // creo el nodo

        if (first == null || first.value.compareTo(x) > 0) {
            // si está vacía o x es menor que el primero

            nuevo.next = first; 
            // el nuevo apunta al actual primero

            first = nuevo; 
            // el nuevo se convierte en la cabeza

            return;
        }

        Node7<T> actual = first; 
        // empiezo desde la cabeza

        while (actual.next != null && actual.next.value.compareTo(x) < 0) {
            // avanzo mientras el siguiente sea menor que x

            actual = actual.next;
        }

        nuevo.next = actual.next; 
        // enlazo con el siguiente

        actual.next = nuevo; 
        // inserto en la posición correcta
    }
}
