/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocuenta;

/**
 *
 * @author carlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta a = new Cuenta();
        a.setNocuenta(1234567890);
        a.setNombrecliente("Carlos Legro");
        a.setSaldo(5);
        
        System.out.println(" "+a.consignar(1));
        System.out.println(" "+a.retirar(1));
    }
    
}
