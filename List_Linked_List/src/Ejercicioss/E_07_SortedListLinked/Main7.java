package E_07_SortedListLinked;

public class Main7 {

    public static void main(String[] args) {

        SortedListLinked7<Integer> lista = new SortedListLinked7<>();

        lista.insertOrden(5); // inserto
        lista.insertOrden(2); // inserto
        lista.insertOrden(8); // inserto
        lista.insertOrden(1); // inserto

        imprimirLista(lista.getFirst()); 
        // debería salir: 1 -> 2 -> 5 -> 8 -> null
    }


    public static <T> void imprimirLista(Node7<T> head) {

        Node7<T> actual = head;

        while (actual != null) {
            System.out.print(actual.value + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
