/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebatriangulo;

/**
 *
 * @author carlo
 */
public class Triangulo {

    private double Base;
    private double Altura;
    private double Area;

    public Triangulo() {
        this(0, 0);
    }

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;

    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Base;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public Triangulo CalcularArea(double Area) {
        Triangulo resultado = new Triangulo();
        resultado.setArea((Base * Math.sqrt((Math.pow(Altura, 2)) - ((Math.pow(Base, 2)) / 4)) / 2));//Base * Math.sqrt((Math.pow(Altura, 2)) - ((Math.pow(Base, 2)) / 4))/2;
        return resultado;
    }

    public Triangulo CalcularArea(Triangulo a) {
        return this.CalcularArea(a.getArea());
    }

}
/* public double calcularArea() {
        double a = (this.Base * Math.sqrt((Math.pow(this.Altura, 2)) - ((Math.pow(this.Base, 2)) / 4)) / 2);
        return a;
    }

    public double calcularPerimetro() {
        double b = 2 * (this.Altura + this.Base);
        return b;
    }

    public double calcularLongitudLados() {
        double c = Math.pow(this.Base, 2) + Math.pow(this.Altura, 2);
        return c;
    }*/
