/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Tareas;
import vista.InterfazGestor;
import javax.swing.JOptionPane;
/**
 *
 * @author Ceciia
 */
public class controladorTareas {
   
     private InterfazGestor vista;

    public controladorTareas(InterfazGestor vista) {
        this.vista = vista;

        vista.btnAgregar.addActionListener(e -> agregarTarea());
        vista.btnCompletada.addActionListener(e -> completarTarea());
    }

    private void agregarTarea() {
        String nombre = JOptionPane.showInputDialog(vista, "Ingrese la tarea:");

        if (nombre != null && !nombre.trim().isEmpty()) {
            vista.modeloLista.addElement(new Tareas(nombre.trim()));
        }
    }

    private void completarTarea() {
        int indice = vista.lstTareas.getSelectedIndex();

        if (indice != -1) {
            Tareas t = vista.modeloLista.getElementAt(indice);
            t.marcarCompletada();
            vista.lstTareas.repaint(); // refrescar visualmente
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione una tarea");
        }
    }
    
}
