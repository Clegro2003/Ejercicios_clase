/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocuenta;

/**
 *
 * @author carlo
 */
public class Cuenta {
    private int nocuenta;
    private String nombrecliente;
    private double saldo;

    public Cuenta() {
    }

    public int getNocuenta() {
        return nocuenta;
    }

    public void setNocuenta(int nocuenta) {
        this.nocuenta = nocuenta;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nocuenta=" + nocuenta + ", nombrecliente=" + nombrecliente + ", saldo=" + saldo + '}';
    }
    
    public boolean consignar(double monto){
        boolean a;
        a = true;
        if(a){
            System.out.println("Cantidad consignada: "+this.getSaldo()+" de la cuenta "+this.getNocuenta()+" del usuario registrado con el nombre "+this.getNombrecliente());
        }
        else{
            System.out.println("Error de credenciales");
        }
    return a;
    }
    
     public boolean retirar(double monto){
         boolean b;
         b=false;
         
        if(b){
            System.out.println("Cantidad retirada: "+this.getSaldo()+" de la cuenta "+this.getNocuenta()+" del usuario registrado con el nombre "+this.getNombrecliente());
        }
        else{
            System.out.println("Error de credenciales");
        }
    return b;
}
}
