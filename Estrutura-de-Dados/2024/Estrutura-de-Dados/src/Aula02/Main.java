/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;
import java.util.Scanner;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Main {
    public static void main(String args[]){
        /*
        Caixa caixa = new Caixa(3,3,3);
        System.out.println(caixa.getAltura());
        caixa.setAltura(0);
        System.out.println(caixa.CalculaVolume());
        Caixa caixa2 = caixa;
        caixa2.setLargura(1);
        */
        /*Caixa2 caixa = new Caixa2(3,3,3);
        System.out.println(caixa.altura);;
        */
        
        //EX01
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira Base:\n");
        double Base = scanner.nextDouble();
        
        System.out.println("Insira Altura:\n");
        double Altura = scanner.nextDouble();
        
        Triangulo tr1 = new Triangulo(Base,Altura);
        System.out.println("A Área do Triangulo: \n"+tr1.Area());
        
        
        
        
    }
}
