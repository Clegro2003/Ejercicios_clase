package ejemplo1_taller5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*Desarrolle una clase Persona, con atributos para sus datos personales, dentro de los cuales se debe incluir la fecha de 
nacimiento (que es un objeto de la clase Fecha con atributos para el día, mes y año), dirección de domicilio y dirección 
de trabajo (que son objetos de la clase Dirección, con los atributos que usted considere necesarios). En la clase 
principal, cree varios objetos personas y muestre sus datos.*/
/**
 *
 * @author carlo
 */
public class Direccion {

    private String city;
    private String country;

    public Direccion() {
    }

    public Direccion(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return   "city=" + city + ", country=" + country;
    }

}
