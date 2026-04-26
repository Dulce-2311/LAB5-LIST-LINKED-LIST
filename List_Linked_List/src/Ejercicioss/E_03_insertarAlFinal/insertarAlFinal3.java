package E_03_insertarAlFinal;

// clase nodo
class Node3<T> {
    T value;
    Node3<T> next;

    public Node3(T value) {
        this.value = value;
        this.next = null; // no apunta a nada al inicio
    }
}


// clase con la lógica
public class insertarAlFinal3 {

    public static <T> Node3<T> insertarAlFinal(Node3<T> head, T valor) {

        Node3<T> nuevo = new Node3<>(valor); // creo el nuevo nodo

        if (head == null) { 
            // si la lista está vacía

            return nuevo; 
            // el nuevo nodo se vuelve la cabeza
        }

        Node3<T> actual = head; 
        // empiezo desde la cabeza

        while (actual.next != null) { 
            // avanzo hasta el último nodo

            actual = actual.next;
        }

        actual.next = nuevo; 
        // AQUÍ inserto realmente al final

        return head; 
        // retorno la cabeza (no cambia)
    }
}