package Actividad1;

public class Tarea implements Comparable<Tarea> {
    private String titulo;
    private int prioridad; // 1 = alta, 2 = media, 3 = baja
    private String estado; // "pendiente", "completada"

    // Constructor
    public Tarea(String titulo, int prioridad, String estado) {
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // toString para mostrar la tarea de forma legible
    @Override
    public String toString() {
        return "Tarea: " + titulo + " | Prioridad: " + prioridad + " | Estado: " + estado;
    }

    // Implementación de compareTo para ordenar por prioridad
    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarea tarea = (Tarea) obj;
        // Consideramos que dos tareas son iguales si tienen el mismo título
        return titulo != null && titulo.equalsIgnoreCase(tarea.titulo);
    }

    @Override
    public int hashCode() {
        return titulo != null ? titulo.toLowerCase().hashCode() : 0;
    }
}