/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversortemperatura;

import modelo.Conversor;
import vista.InterfazConversor;
import controlador.ControladorConversor;
/**
 *
 * @author Ceciia
 */
public class ConversorTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear modelo y vista
    InterfazConversor vista = new InterfazConversor();
    Conversor modelo = new Conversor();
    
    // Crear controlador
    new ControladorConversor(vista, modelo);
    
    // Mostrar la ventana
    vista.setVisible(true);
    }
    
}
