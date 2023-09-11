/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacoche;

/**
 *
 * @author carlo
 */
public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int ncaballos;
    private int npuertas;
    private String matricula;

    public Coche() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNcaballos() {
        return ncaballos;
    }

    public void setNcaballos(int ncaballos) {
        this.ncaballos = ncaballos;
    }

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "color: " + color + ", marca: " + marca + ", modelo: " + modelo + ", ncaballos: " + ncaballos + ", npuertas: " + npuertas + ", matricula: " + matricula;
    }
    
    
}
