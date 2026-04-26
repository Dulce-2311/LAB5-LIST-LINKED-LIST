package E_01_buscarElemento;

public class MainBuscar {

    public static void main(String[] args) {

        ListLinked1<String> lista = new ListLinked1<>();

        lista.insertLast("A");
        lista.insertLast("B");
        lista.insertLast("C");

        boolean r1 = buscarElementos.buscarElemento(lista, "B");
        System.out.println("¿Está B? " + r1);

        boolean r2 = buscarElementos.buscarElemento(lista, "X");
        System.out.println("¿Está X? " + r2);
    }
}