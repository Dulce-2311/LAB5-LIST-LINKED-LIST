
package E_01_buscarElemento;
// clase nodo
class Node1<T> {
    T value;
    Node1<T> next;

    public Node1(T value) {
        this.value = value;
        this.next = null; // inicialmente no apunta a nada
    }
}


// clase lista enlazada
class ListLinked1<T> {

    private Node1<T> first; // referencia al primer nodo

    public ListLinked1() {
        first = null; // lista vacía
    }

    public Node1<T> getFirst() {
        return first; // devuelve el primer nodo
    }

    public void insertLast(T x) {

        Node1<T> nuevo = new Node1<>(x); // creo el nodo

        if (first == null) { 
            // si está vacía

            first = nuevo; // el nuevo es el primero

        } else {

            Node1<T> actual = first; 

            while (actual.next != null) { 
                // avanzo hasta el final

                actual = actual.next;
            }

            actual.next = nuevo; 
            // inserto al final
        }
    }
}


// clase con el método buscar
public class buscarElementos {

    public static <T> boolean buscarElemento(ListLinked1<T> lista, T valor) {

        Node1<T> actual = lista.getFirst(); 
        // empiezo desde el inicio

        while (actual != null) { 
            // recorro toda la lista

            if (actual.value.equals(valor)) { 
                // comparo

                return true; // encontrado
            }

            actual = actual.next; 
            // avanzo
        }

        return false; 
        // no encontrado
    }
}