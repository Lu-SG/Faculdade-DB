/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 * Escreva um main Java que solicita 5 valores ao usuário, armazena esses valores em um array chamado vet1 de inteiros. Depois, copia o conteúdo desse array para um segundo array chamado vet1. O programa deve imprimir os dois arrays na tela.
 */
public class questão_11_protrabalho {
    public static void main(String[] args) {
        int vet1_a[];
        vet1_a =  new int[5];
        int vet2_a[];
        vet2_a =  new int[5];
        int cont;
        String resultado_1 = "";
        String resultado_2 = "";
        
        for(cont=0;cont<vet1_a.length;cont++){
            vet1_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero"));
        }
        
        for(cont=0;cont<vet2_a.length;cont++){
            vet2_a[cont] = vet1_a[cont];
        }
        
        for(cont=0;cont<vet1_a.length;cont++){
            resultado_1 = resultado_1 +""+ +vet1_a[cont]; 
        }
        
        for(cont=0;cont<vet2_a.length;cont++){
            resultado_2 = resultado_2 +""+ +vet2_a[cont]; 
        }
        System.out.println(""+resultado_1);
        System.out.println(""+resultado_2);
    }
}
