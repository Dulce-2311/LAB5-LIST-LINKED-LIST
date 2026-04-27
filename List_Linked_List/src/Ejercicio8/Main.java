package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        ColaReproduccion<Cancion> cola = new ColaReproduccion<>(); 
        // creo la cola (estructura donde se guardan las canciones como lista doble)

        cola.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen", 354));
        cola.agregarCancion(new Cancion("Blinding Lights", "The Weeknd", 200));
        cola.agregarCancion(new Cancion("Shape of You", "Ed Sheeran", 234));
        cola.agregarCancion(new Cancion("Levitating", "Dua Lipa", 203));
        cola.agregarCancion(new Cancion("Bad Guy", "Billie Eilish", 194));
        cola.agregarCancion(new Cancion("Happier Than Ever", "Billie Eilish", 298));
        // agrego canciones al final de la lista (simula una cola de reproducción)

        System.out.println("=== Cola de Reproducción Inicial ===");
        cola.mostrarCola(); 
        // muestra toda la lista y marca cuál es la canción actual

        System.out.println("\nReproduciendo:");
        for (int i = 0; i < 3; i++) {
            System.out.println(cola.reproducirSiguiente()); 
            // avanzo en la lista (uso el puntero siguiente, no recorro desde el inicio)
        }

        System.out.println("\n◄ Anterior:");
        System.out.println(cola.reproducirAnterior()); 
        // retrocedo usando el puntero anterior (esto es lo importante de la lista doble)
    }
}