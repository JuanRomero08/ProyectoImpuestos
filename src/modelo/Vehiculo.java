/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanr
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private int cilindraje;
    private double avaluo;
    private String tipoUso;

    public Vehiculo(String marca, String modelo, int anio, int cilindraje, double avaluo, String tipoUso) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindraje = cilindraje;
        this.avaluo = avaluo;
        this.tipoUso = tipoUso;
    }

    public int getAntiguedad() {
        int anioActual = 2026;
        return anioActual - anio;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}
