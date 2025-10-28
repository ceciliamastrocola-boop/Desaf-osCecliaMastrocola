/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Conversor;
import vista.InterfazConversor;
import javax.swing.JOptionPane;
/**
 *
 * @author Ceciia
 */
public class ControladorConversor {
    private InterfazConversor vista;
    private Conversor modelo;

    public ControladorConversor(InterfazConversor vista, Conversor modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnConvertir.addActionListener(e -> convertir());
    }

    private void convertir() {
        try {
            double valor = Double.parseDouble(vista.txtEntrada.getText());
            double resultado;
            if (vista.cmbConversor.getSelectedIndex() == 0) {
                resultado = modelo.celsiusAFahrenheit(valor);
            } else {
                resultado = modelo.fahrenheitACelsius(valor);
            }
            vista.txtSalida.setText(String.format("%.2f", resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
