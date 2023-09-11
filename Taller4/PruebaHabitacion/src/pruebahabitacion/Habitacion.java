/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebahabitacion;

/**
 *
 * @author carlo
 */
public class Habitacion {

    private double Ancho;
    private double Alto;
    private double Largo;

    public Habitacion() {
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public double CalcularMetroCuadradosEnchape() {
        return this.Ancho * this.Largo;

    }

 public double CalcularMetroCuadradosTapiz() {
        return this.Ancho * this.Largo;

    }

}
