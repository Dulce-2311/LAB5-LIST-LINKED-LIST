package E_03_insertarAlFinal;

public class MainInsertar3 {

    public static void main(String[] args) {

        Node3<String> head = null; // inicio lista vacía

        head = insertarAlFinal3.insertarAlFinal(head, "A"); // inserto A
        imprimirLista(head); // A -> null

        head = insertarAlFinal3.insertarAlFinal(head, "B"); // inserto B
        imprimirLista(head); // A -> B -> null

        head = insertarAlFinal3.insertarAlFinal(head, "C"); // inserto C
        imprimirLista(head); // A -> B -> C -> null
    }


    public static <T> void imprimirLista(Node3<T> head) {

        Node3<T> actual = head; 
        // empiezo desde la cabeza

        while (actual != null) { 
            // recorro toda la lista

            System.out.print(actual.value + " -> "); 
            // imprimo cada valor

            actual = actual.next; 
            // avanzo
        }

        System.out.println("null"); 
        // fin de la lista
    }
}