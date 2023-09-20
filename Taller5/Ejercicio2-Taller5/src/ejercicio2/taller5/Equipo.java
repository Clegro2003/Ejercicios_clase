/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.taller5;

/*Se desea un programa que permita el registro de los equipos que participan en un campeonato de microfútbol. Se 
conoce que el campeonato puede inscribir máximo 5 equipos. Para cada equipo se debe registrar su nombre, la ciudad 
de origen, el nombre de su técnico y su no de inscripción. El programa debe crear un campeonato, registrando su 
nombre, duración en meses, premiación del ganador, y los equipos participantes. Así mismo, deberá permitir imprimir 
toda su información.*/
/**
 *
 * @author carlo
 */
public class Equipo {

    private String name;
    private String city;
    private String nametrainerman;
    private int numinscrip;
    private RegistroCampeonato Campeonato; 
            
    public Equipo() {
    }

    public Equipo(String name, String city, String nametrainerman, int numinscrip) {
        this.name = name;
        this.city = city;
        this.nametrainerman = nametrainerman;
        this.numinscrip = numinscrip;
    }

    public Equipo(String name, String city, String nametrainerman, int numinscrip, RegistroCampeonato Campeonato) {
        this.name = name;
        this.city = city;
        this.nametrainerman = nametrainerman;
        this.numinscrip = numinscrip;
        this.Campeonato = Campeonato;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNametrainerman() {
        return nametrainerman;
    }

    public void setNametrainerman(String nametrainerman) {
        this.nametrainerman = nametrainerman;
    }

    public int getNuminscrip() {
        return numinscrip;
    }

    public void setNuminscrip(int numinscrip) {
        this.numinscrip = numinscrip;
    }

    public RegistroCampeonato getCampeonato() {
        return Campeonato;
    }

    public void setCampeonato(RegistroCampeonato Campeonato) {
        this.Campeonato = Campeonato;
    }

    
  
    @Override
    public String toString() {
        return "name: " + name
                + "\n city: " + city
                + "\n  nametrainerman: " + nametrainerman
                + "\n numero de inscripcion: " + numinscrip;
    }

}
