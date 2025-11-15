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
        this.completada = false;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return (completada ? "[✔] " : "[ ] ") + nombre;
    }
}
