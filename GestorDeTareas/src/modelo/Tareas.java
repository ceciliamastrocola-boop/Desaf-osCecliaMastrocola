/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ceciia
 */
public class Tareas {
        private String nombre;
    private boolean completada;

    public Tareas(String nombre) {
        this.nombre = nombre;
        this.completada = false; // por defecto no completada
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        // Mostrar ✔ si está completada
        return nombre + (completada ? " ✔" : "");
    }
    
}
