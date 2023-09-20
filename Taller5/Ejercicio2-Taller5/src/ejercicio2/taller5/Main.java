/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.taller5;

import java.time.LocalDate;

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
        Equipo e = new Equipo("Junior", "Barranquilla", "Arturo Reyes", 01);
        Equipo e1 = new Equipo("America de cali", "Cali", "Lucas Gonzales", 04);
        Equipo e2 = new Equipo("Santa Fe", "Bogota", "Hugo Bodhert", 02);
        Equipo e3 = new Equipo("Millonarios", "Bogota", "Alberto Gamero", 03);

        
        RegistroCampeonato rc =new RegistroCampeonato("SerieColombia", LocalDate.MAX, 1+"millon", 3);
        
        
        
        


    
    }

}
