/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestordetareas;

import vista.InterfazGestor;
import controlador.controladorTareas;

/**
 *
 * @author Ceciia
 */
public class GestorDeTareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Crear la vista
        InterfazGestor vista = new InterfazGestor();

        // Crear el controlador (conecta los botones con la lógica)
        new controladorTareas(vista);

        // Mostrar la vista
        vista.setVisible(true);
    }
    
}
