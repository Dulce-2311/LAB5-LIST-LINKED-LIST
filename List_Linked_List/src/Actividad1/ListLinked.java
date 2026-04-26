package Actividad1;

public class ListLinked<T> {
    private Node<T> first;

    public Node<T> getFirst() {
        return first;
    }

    public ListLinked() {
        this.first = null;
    }

    public void insertFirst(T x) {
        Node<T> nuevo = new Node<>(x);
        nuevo.next = first;
        first = nuevo;
    }

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

    public int length() {
        int count = 0;
        Node<T> actual = first;
        while (actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }

    public boolean isEmptyList() {
        return first == null;
    }

    public void print() {
        Node<T> actual = first;
        while (actual != null) {
            System.out.print(actual.value + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node<T> anterior = null;
        Node<T> actual = first;
        Node<T> siguiente;

        while (actual != null) {
            siguiente = actual.next;
            actual.next = anterior;
            anterior = actual;
            actual = siguiente;
        }

        first = anterior;
    }
}