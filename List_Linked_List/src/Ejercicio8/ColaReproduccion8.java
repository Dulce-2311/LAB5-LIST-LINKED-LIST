package Ejercicio8;

import java.util.Random; 
// uso Random porque lo necesito para mezclar (shuffle)

class Cancion {
    private String titulo;
    private String artista;
    private int duracionSeg;

    public Cancion(String titulo, String artista, int duracionSeg) {
        this.titulo = titulo; 
        this.artista = artista; 
        this.duracionSeg = duracionSeg; 
    }

    public String getTitulo() {
        return titulo; 
    }
    public String getArtista() {
        return artista; 
    }
    public int getDuracionSeg() {
        return duracionSeg; 
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + duracionSeg + "s)";
        // esto es cómo se imprime la canción
    }
}

// nodo doble porque necesito ir adelante y atrás (clave del ejercicio)
class NodoDoble<T> {
    T dato; // guardo la información (la canción)
    NodoDoble<T> siguiente; // apunta al siguiente nodo
    NodoDoble<T> anterior; // apunta al anterior nodo

    public NodoDoble(T dato) {
        this.dato = dato;  // guardo lo que sea (por eso es genérico <T>)
        this.siguiente = null; // al inicio no hay siguiente
        this.anterior = null;  // al inicio no hay anterior
    }
}

class ColaReproduccion8<T> {
    private NodoDoble<T> inicio; // inicio de la lista (primer nodo)
    
    private NodoDoble<T> fin; // último nodo (sirve para agregar rápido al final)
    
    private NodoDoble<T> actual;  // este es CLAVE: representa la canción que se está reproduciendo

    public void agregarCancion(T cancion) {
        NodoDoble<T> nuevo = new NodoDoble<>(cancion); 
        // creo un nodo nuevo porque la lista guarda nodos, no canciones sueltas

        if (inicio == null) { // si la lista está vacía
            inicio = fin = actual = nuevo; // todo apunta al mismo nodo (primer elemento)
            
        } else {
            fin.siguiente = nuevo; // el último nodo apunta al nuevo (lo engancho)
            
            nuevo.anterior = fin; // el nuevo apunta hacia atrás (esto permite ir atrás después)
        
            fin = nuevo; // actualizo el final porque ya agregué uno nuevo
            
        }
    }

    public T reproducirSiguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente; 
            // avanzo en la lista, simula botón "siguiente"
        }
        return actual != null ? actual.dato : null; 
        // devuelvo la canción actual
    }

    public T reproducirAnterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior; 
            // retrocedo sin recorrer toda la lista (esto es lo importante del prev)
        }
        return actual != null ? actual.dato : null;
    }
@SuppressWarnings("unchecked")
    public void mezclar() {
        int cantidad = 0;
        NodoDoble<T> recorrido = inicio;

        while (recorrido != null) {
            cantidad++; 
            // cuento cuántos nodos hay porque necesito tamaño
            recorrido = recorrido.siguiente;
        }

        Object[] arreglo = new Object[cantidad]; 
        // uso arreglo porque es más fácil mezclar ahí

        recorrido = inicio;
        int i = 0;

        while (recorrido != null) {
            arreglo[i++] = recorrido.dato; 
            // paso todos los datos al arreglo
            recorrido = recorrido.siguiente;
        }

        Random random = new Random();

 // Baraja el arreglo de atrás hacia adelante para eliminar patrones de repetición.
        for (int j = cantidad - 1; j > 0; j--) {
            int k = random.nextInt(j + 1); 
            // posición aleatoria

            Object temp = arreglo[j];
            arreglo[j] = arreglo[k];
            arreglo[k] = temp;
            // intercambio posiciones 
        }

        inicio = fin = actual = null; 
        // borro la lista actual para reconstruirla

        for (Object obj : arreglo) {
            agregarCancion((T) obj); 
            // vuelvo a meter los elementos ya mezclado
        }
    }

    public void mostrarCola() {
        NodoDoble<T> recorrido = inicio;
        int posicion = 1;

        while (recorrido != null) {
            System.out.print(posicion + ". " + recorrido.dato);

            if (recorrido == actual) {
                System.out.print("  <-- actual"); 
                // marco cuál es la canción actual (clave para entender)
            }

            System.out.println();
            recorrido = recorrido.siguiente; 
            // avanzo nodo por nodo
            posicion++;
        }
    }

    public int duracionTotal() {
        int total = 0;
        NodoDoble<T> recorrido = inicio;

        while (recorrido != null) {
            Cancion c = (Cancion) recorrido.dato; 
            // convierto porque T es genérico pero sé que es Cancion

            total += c.getDuracionSeg(); 
            // sumo todas las duraciones

            recorrido = recorrido.siguiente;
        }

        return total; 
        // retorno total en segundoss
    }
}