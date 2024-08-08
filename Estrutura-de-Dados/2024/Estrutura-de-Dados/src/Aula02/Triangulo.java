/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Triangulo {
    private double Base;
    private double Altura;
    
    public Triangulo (Double Base, Double Altura){
        this.Base = Base;
        this.Altura = Altura;
    }

    /**
     * @return the Base
     */
    public double getBase() {
        return Base;
    }

    /**
     * @param Base the Base to set
     */
    public void setBase(double Base) {
        this.Base = Base;
    }

    /**
     * @return the Altura
     */
    public double getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    public double Area(){
        return (this.Base * this.Altura) / 2;
    }
    
    
}
