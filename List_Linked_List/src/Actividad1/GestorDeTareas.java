package Actividad1;

public class GestorDeTareas<T extends Comparable<T>> {
    private ListLinked<T> listaTareas;

    public GestorDeTareas() {
        listaTareas = new ListLinked<>();
    }

    public Node<T> obtenerPrimerNodo() {
    return listaTareas.getFirst();
    }

    // Agrega al final
    public void agregarTarea(T tarea) {
        listaTareas.insertLast(tarea);
    }

    // Elimina la tarea si existe
    public boolean eliminarTarea(T tarea) {
        return listaTareas.removeNode(tarea);
    }

    // Busca una tarea
    public boolean contieneTarea(T tarea) {
        return listaTareas.search(tarea);
    }

    // Imprime todas las tareas
    public void imprimirTareas() {
        listaTareas.print();
    }

    // Cuenta el total de tareas
    public int contarTareas() {
        return listaTareas.length();
    }

    // Obtiene la tarea más prioritaria (la menor según compareTo)
    public T obtenerTareaMasPrioritaria() {
        if (listaTareas.isEmptyList()) {
            return null; // Si no hay elementos, retornamos null
        }

        T masPrioritaria = listaTareas.getFirst().value;
        Node<T> actual = listaTareas.getFirst().next;

        while (actual != null) {
            if (actual.value.compareTo(masPrioritaria) < 0) {
                masPrioritaria = actual.value;
            }
            actual = actual.next;
        }

        return masPrioritaria;
    }

    // Invierte la lista de tareas
    public void invertirTareas() {
        listaTareas.reverse();
    }
}