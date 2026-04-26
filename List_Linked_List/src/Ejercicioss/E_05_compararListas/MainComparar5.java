package E_05_compararListas;

public class MainComparar5 {

    public static void main(String[] args) {

        ListLinked5<String> lista1 = new ListLinked5<>(); 
        ListLinked5<String> lista2 = new ListLinked5<>();

        // lleno lista1
        lista1.insertLast("A");
        lista1.insertLast("B");
        lista1.insertLast("C");

        // lleno lista2 (igual)
        lista2.insertLast("A");
        lista2.insertLast("B");
        lista2.insertLast("C");

        boolean resultado = compararListas5.sonIguales(lista1, lista2); 
        // llamo al método

        System.out.println("¿Son iguales? " + resultado); 
        // debería salir true
    }
}

