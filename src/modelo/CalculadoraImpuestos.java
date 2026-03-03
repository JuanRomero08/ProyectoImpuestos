/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanr
 */
public class CalculadoraImpuestos {
   private static final double TARIFA_BAJA = 0.015;
    private static final double TARIFA_MEDIA = 0.025;
    private static final double TARIFA_ALTA = 0.035;

    private static final double AJUSTE_PUBLICO = 1.10;
    private static final double DESCUENTO_ANTIGUO = 0.90;

    public double calcularImpuesto(Vehiculo vehiculo) {

        double avaluo = vehiculo.getAvaluo();
        double impuestoBase;

        if (avaluo < 50000000) {
            impuestoBase = avaluo * TARIFA_BAJA;
        } else if (avaluo < 100000000) {
            impuestoBase = avaluo * TARIFA_MEDIA;
        } else {
            impuestoBase = avaluo * TARIFA_ALTA;
        }

        if (vehiculo.getTipoUso().equalsIgnoreCase("Publico")) {
            impuestoBase *= AJUSTE_PUBLICO;
        }

        if (vehiculo.getAntiguedad() > 10) {
            impuestoBase *= DESCUENTO_ANTIGUO;
        }

        return impuestoBase;
    }
}