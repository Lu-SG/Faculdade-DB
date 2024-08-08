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
public class Caixa {
    private double altura;
    private double largura;
    private double profundidade;

    public Caixa (double altura, double largura, double profundidade){
        this.altura = altura;
        this.largura =  largura;
        this.profundidade =  profundidade;
    }
    
    public Caixa (){
        this.altura = 0;
        this.largura =  0;
        this.profundidade = 0;
    }
    
    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * @return the profundidade
     */
    public double getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
    
    public double CalculaVolume(){
        return this.altura * this.largura * this.profundidade;
    }
}
