/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;
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
        /*
        Fila fila = new Fila(4);
        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.insere(5);
        
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        */
        /*
        int tam;
        System.out.println("Insira Tamanho Fila:");
        tam = scanner.nextInt();
        Fila fila = new Fila(tam);
        for (int i = 0; i <  fila.getTam(); i++) {
            System.out.println("Insira Elemento:");
            fila.insere(scanner.nextInt());
        }
        for (int i = 0; i <  fila.getTam(); i++) {
            System.out.println(fila.remove());
        }
        */
        FilaCircular filaC = new FilaCircular(4);
        filaC.insere(1);
        filaC.insere(2);
        filaC.insere(3);
        filaC.insere(4);
        
        System.out.println(filaC.remove());
        System.out.println(filaC.remove());
        System.out.println(filaC.remove());
        System.out.println(filaC.remove());
        
               
        
    }
}
