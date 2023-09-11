/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebahabitacion;

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
        Habitacion a = new Habitacion();
        a.setAncho(5);
        a.setLargo(5);

        System.out.println("La cantidad de metros cuadrados que se requiere de enchape para el piso de la habitacion A es de: " + a.CalcularMetroCuadradosEnchape());

        a.setAncho(2);
        a.setLargo(2);
        System.out.println("Los metros cuadrados de papel se requiere para tapizar sus paredes es de: " + a.CalcularMetroCuadradosTapiz());

        Habitacion b = new Habitacion();
        b.setAncho(4);
        b.setLargo(5);

        System.out.println("La cantidad de metros cuadrados que se requiere de enchape para el piso de la habitacion B es de: " + b.CalcularMetroCuadradosEnchape());

        b.setAncho(2);
        b.setLargo(6);
        System.out.println("Los metros cuadrados de papel se requiere para tapizar sus paredes es de: " + b.CalcularMetroCuadradosTapiz());

    }

}
