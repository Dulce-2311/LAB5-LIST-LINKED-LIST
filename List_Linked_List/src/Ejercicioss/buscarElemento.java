public class buscarElemento {

public class Main {
    public static void main(String[] args) {

        // creo mi lista de tipo String
        ListLinked<String> lista = new ListLinked<>();

        // meto algunos valores
        lista.insertLast("A");
        lista.insertLast("B");
        lista.insertLast("C");

        // busco uno que sí está
        boolean resultado1 = buscarElemento(lista, "B");
        System.out.println("¿Está B? " + resultado1); 
        // debería salir true porque sí está en la lista

        // busco uno que no está
        boolean resultado2 = buscarElemento(lista, "X");
        System.out.println("¿Está X? " + resultado2); 
        // debería salir false porque no existe en la lista
    }


    public static <T> boolean buscarElemento(ListLinked<T> lista, T valor) {
        Node<T> actual = lista.getFirst(); 
        // agarro el primer nodo, desde aquí empiezo a recorrer

        while (actual != null) { 
            // mientras no llegue al final de la lista (null = ya no hay más nodos)

            if (actual.value.equals(valor)) { 
                // comparo el valor del nodo actual con el que estoy buscando
                // uso equals porque puede ser cualquier tipo (no uso ==)

                return true; 
                // si lo encuentro, listo, corto todo y retorno true
            }

            actual = actual.next; 
            // avanzo al siguiente nodo (si no hago esto me quedo en el mismo y se hace loop infinito 💀)
        }

        return false; 
        // si recorrí toda la lista y nunca lo encontré, retorno false
    }
}