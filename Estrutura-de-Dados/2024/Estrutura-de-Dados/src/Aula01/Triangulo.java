package Aula01;

public class Triangulo {

    double Base;
    double Altura;
    double Area;

    public Triangulo(double Base, Double Altura){
        this.Base = Base;
        this.Altura = Altura;
    }

    public Double calculaArea(){
        Area = (Base * Altura) / 2;
        return Area;
    }


}
