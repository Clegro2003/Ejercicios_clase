/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1_taller5;

import java.time.LocalDate;

/*Desarrolle una clase Persona, con atributos para sus datos personales, dentro de los cuales se debe incluir la fecha de 
nacimiento (que es un objeto de la clase Fecha con atributos para el día, mes y año), dirección de domicilio y dirección 
de trabajo (que son objetos de la clase Dirección, con los atributos que usted considere necesarios). En la clase 
principal, cree varios objetos personas y muestre sus datos.
 */
/**
 *
 * @author carlo
 */
public class Persona {

    private double id;
    private String name;
    private String Lname;
    private int age;
    private LocalDate startdate;
    private Direccion home;

    public Persona() {
    }

    public Persona(double id, String name, String Lname, int age) {
        this.id = id;
        this.name = name;
        this.Lname = Lname;
        this.age = age;
    }

    public Persona(double id, String name, String Lname, int age, LocalDate startdate, Direccion home) {
        this.id = id;
        this.name = name;
        this.Lname = Lname;
        this.age = age;
        this.startdate = startdate;
        this.home = home;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public Direccion getHome() {
        return home;
    }

    public void setHome(Direccion home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return  "  id: " + id 
                + ", \n name: " + name 
                + ", \n Lname: " + Lname 
                + ", \n age: " + age 
                + ", \n startdate: " + startdate 
                + ", \n home: " + home.toString();
    }
    /*public String toString() {

        String datos = String.format("Nombre:  %n"
                + "Apellido         : %s%n"
                + "Documento        : %s%n"
                + "Edad             : %s%n"
                + "Direccion        : %s%n"
                + "Empresa          : %s%n"
                + "Fecha vinculacion: %s%n",
                this.name,
                this.Lname,
                this.id,
                this.age,
                this.home.toString(),
                this.startdate);
        return datos;*/
    }


