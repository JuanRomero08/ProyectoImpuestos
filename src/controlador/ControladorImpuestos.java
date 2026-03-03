/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Vehiculo;
import modelo.CalculadoraImpuestos;
import vista.VistaImpuestos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author juanr
 */
public class ControladorImpuestos {

    private VistaImpuestos vista;
    private CalculadoraImpuestos calculadora;

    public ControladorImpuestos(VistaImpuestos vista) {
        this.vista = vista;
        this.calculadora = new CalculadoraImpuestos();

        this.vista.agregarListenerCalcular(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void calcular() {

        try {

            Vehiculo vehiculo = new Vehiculo(
                    vista.getMarca(),
                    vista.getModelo(),
                    vista.getAnio(),
                    vista.getCilindraje(),
                    vista.getAvaluo(),
                    vista.getTipoUso()
            );

            double impuesto = calculadora.calcularImpuesto(vehiculo);

            vista.mostrarResultado(impuesto);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Por favor ingrese valores numericos validos.",
                    "Error de Datos",
                    JOptionPane.ERROR_MESSAGE
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    vista,
                    "Ocurrio un error: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Método principal 
    public static void main(String[] args) {

        VistaImpuestos vista = new VistaImpuestos();
        ControladorImpuestos controlador = new ControladorImpuestos(vista);

        vista.setVisible(true);
    }
}
