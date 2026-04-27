package Actividad1;

public class Main {
    public static void main(String[] args) {
        // 1. Crear una instancia de GestorDeTareas con Tarea
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        // 2. Agregar al menos 5 tareas con distintas prioridades y estados
        gestor.agregarTarea(new Tarea("Diseñar BD", 2, "pendiente"));
        gestor.agregarTarea(new Tarea("Deploy producción", 1, "pendiente"));
        gestor.agregarTarea(new Tarea("Documentar API", 3, "completada"));
        gestor.agregarTarea(new Tarea("Code review", 2, "pendiente"));
        gestor.agregarTarea(new Tarea("Corregir bug #42", 1, "completada"));

        // 3. Eliminar una tarea existente (eliminamos "Code review")
        gestor.eliminarTarea(new Tarea("Code review", 2, "pendiente"));

        // 4. Imprimir todas las tareas actuales
        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        // 5. Verificar si cierta tarea existe ("Deploy producción")
        System.out.println("¿Existe 'Deploy producción'?: " +
            gestor.contieneTarea(new Tarea("Deploy producción", 1, "pendiente")));

        // 6. Obtener e imprimir la tarea más prioritaria
        Tarea masPrioritaria = gestor.obtenerTareaMasPrioritaria();
        System.out.println("Tarea más prioritaria: " + masPrioritaria);

        // 7. Invertir la lista e imprimirla
        gestor.invertirTareas();
        System.out.println("Lista invertida:");
        gestor.imprimirTareas();

        // 8. Transferir las tareas completadas a otra lista e imprimirla
        GestorDeTareas<Tarea> completadas = new GestorDeTareas<>();

        // Primero, identificamos y agregamos a la lista de completadas
        Node<Tarea> actual = gestor.obtenerPrimerNodo();
        while (actual != null) {
            if (actual.value.getEstado().equals("completada")) {
                completadas.agregarTarea(actual.value);
            }
            actual = actual.next;
        }

        // Luego, las eliminamos de la lista original
        // Usamos los datos de la lista 'completadas' para saber qué borrar en 'gestor'
        Node<Tarea> actualC = completadas.obtenerPrimerNodo();
        while (actualC != null) {
            gestor.eliminarTarea(actualC.value);
            actualC = actualC.next;
        }

        System.out.println("Tareas completadas:");
        completadas.imprimirTareas();
    }
}