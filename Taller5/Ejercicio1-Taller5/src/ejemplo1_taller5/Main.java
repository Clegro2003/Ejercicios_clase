/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1_taller5;

import java.time.LocalDate;
import java.time.Month;

/*
Desarrolle una clase Persona, con atributos para sus datos personales, dentro de los cuales se debe incluir la fecha de 
nacimiento (que es un objeto de la clase Fecha con atributos para el día, mes y año), dirección de domicilio y dirección 
de trabajo (que son objetos de la clase Dirección, con los atributos que usted considere necesarios). En la clase 
principal, cree varios objetos personas y muestre sus datos.

 */
/**
 *
 * @author carlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p = new Persona(12345, "carlos", "legro", 20);
        p.setHome(new Direccion("Valledupar", "Cesar"));
        p.setStartdate(LocalDate.now());

        Persona p1 = new Persona(24680, "Jose", "Lopez", 30);
        p1.setHome(new Direccion("Soledad", "Atlantico"));
        p1.setStartdate(LocalDate.of(12, Month.FEBRUARY, 28));

        imprimirPersona(p);
        imprimirPersona(p1);

    }
    public static void imprimirPersona(Persona p) {
        System.out.println("Informacion de Persona: ");
        System.out.println("---------------------------------");
        System.out.println(p);
        System.out.println("---------------------------------\n");
    }
}