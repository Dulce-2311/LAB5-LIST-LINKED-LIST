package estructuras;

public class ListLinked<T> {

    private Node<T> first;

    public ListLinked() {
        first = null;
    }

    // 🔹 Getter del primero (IMPORTANTE)
    public Node<T> getFirst() {
        return first;
    }

    // 🔹 Insertar al inicio
    public void insertFirst(T x) {
        Node<T> nuevo = new Node<>(x);
        nuevo.next = first;
        first = nuevo;
    }

    // 🔹 Insertar al final
    public void insertLast(T x) {
        Node<T> nuevo = new Node<>(x);

        if (first == null) {
            first = nuevo;
        } else {
            Node<T> actual = first;

            while (actual.next != null) {
                actual = actual.next;
            }

            actual.next = nuevo;
        }
    }

    // 🔹 Buscar elemento
    public boolean search(T x) {
        Node<T> actual = first;

        while (actual != null) {
            if (actual.value.equals(x)) {
                return true;
            }
            actual = actual.next;
        }

        return false;
    }

    // 🔹 Eliminar nodo
    public boolean removeNode(T x) {
        if (first == null) {
            return false;
        }

        if (first.value.equals(x)) {
            first = first.next;
            return true;
        }

        Node<T> actual = first.next;
        Node<T> anterior = first;

        while (actual != null) {
            if (actual.value.equals(x)) {
                anterior.next = actual.next;
                return true;
            }

            anterior = actual;
            actual = actual.next;
        }

        return false;
    }

    // 🔹 Imprimir lista
    public void print() {
        Node<T> actual = first;

        while (actual != null) {
            System.out.print(actual.value + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
