package E_05_compararListas;

// clase nodo
class Node5<T> {
    T value;
    Node5<T> next;

    public Node5(T value) {
        this.value = value;
        this.next = null; // no apunta a nada al inicio
    }
}


// lista enlazada
class ListLinked5<T> {

    private Node5<T> first;

    public ListLinked5() {
        first = null; // lista vacía
    }

    public Node5<T> getFirst() {
        return first; // devuelve el primer nodo
    }

    public void insertLast(T x) {

        Node5<T> nuevo = new Node5<>(x); // creo nodo

        if (first == null) {
            first = nuevo; // si está vacía
        } else {

            Node5<T> actual = first;

            while (actual.next != null) { // busco el último
                actual = actual.next;
            }

            actual.next = nuevo; // inserto al final
        }
    }
}


// clase con la lógica
public class compararListas5 {

    public static <T> boolean sonIguales(ListLinked5<T> lista1, ListLinked5<T> lista2) {

        Node5<T> actual1 = lista1.getFirst(); // inicio de lista1
        Node5<T> actual2 = lista2.getFirst(); // inicio de lista2

        while (actual1 != null && actual2 != null) { 
            // recorro ambas listas al mismo tiempo

            if (!actual1.value.equals(actual2.value)) { 
                // comparo valores

                return false; 
                // si alguno es distinto, ya no son iguales
            }

            actual1 = actual1.next; // avanzo en lista1
            actual2 = actual2.next; // avanzo en lista2
        }

        if (actual1 != null || actual2 != null) { 
            // si una lista es más larga que la otra

            return false;
        }

        return true; 
        // si todo coincidió, son iguales
    }
}