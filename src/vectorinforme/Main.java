/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectorinforme;

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
          int[] reporte = new int[]{120, 30, 110, 40, 80, 60, 50, 70, 90, 20, 100, 10};
                                            //{Ene,Feb,Mar,Abr,May,Jun,Jul,Ago,Sep,Oct,Nov,Dic};
        int acum = 0;
        int menor = 1300000, mayor = 0,prom=0;
        
        for (int i = 0; i <= 11; i++) {
            acum = acum + reporte[i];
            if (menor > reporte[i]) {
                menor = reporte[i];
            }
            if (mayor < reporte[i]) {
                mayor = reporte[i];
            }
            prom=acum/12;
        }

        System.out.println("Sumatoria de ventas: " + acum);
        System.out.println("El mes de menos ventas fue de: " + menor);
        System.out.println("El mes de mayor ventas fue de: " + mayor);
        System.out.println("Promedio de ventas: " + prom);
    }
    }
    

