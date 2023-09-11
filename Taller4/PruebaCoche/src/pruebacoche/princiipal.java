/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacoche;

/**
 *
 * @author carlo
 */
public class princiipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche a = new Coche();
        a.setColor("rojo");
        a.setMarca("Renault");
        a.setMatricula("123abc");
        a.setModelo("Twingo");
        a.setNcaballos(58);
        a.setNpuertas(3);
        
        Coche b = new Coche();
        b.setColor("azul");
        b.setMarca("Renault");
        b.setMatricula("246bdf");
        b.setModelo("Kwid");
        b.setNcaballos(68);
        b.setNpuertas(2);
        
        System.out.println("SUS DATOS SON: "+a.toString());
        System.out.println("SUS DATOS SON: "+b.toString());
    
    }
    
}
