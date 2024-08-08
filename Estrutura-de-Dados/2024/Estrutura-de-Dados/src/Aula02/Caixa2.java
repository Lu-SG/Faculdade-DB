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
public class Caixa2 {
    public double altura;
    public double largura;
    public double profundidade;

    public Caixa2 (double altura, double largura, double profundidade){
        this.altura = altura;
        this.largura =  largura;
        this.profundidade =  profundidade;
    }
    
    public Caixa2 (){
        this.altura = 0;
        this.largura =  0;
        this.profundidade = 0;
    }
    
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
    
    public double CalculaVolume(){
        return this.altura * this.largura * this.profundidade ;
    }
}
