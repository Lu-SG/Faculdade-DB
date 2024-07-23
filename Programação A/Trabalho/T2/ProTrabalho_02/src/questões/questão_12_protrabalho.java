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
 * 12)Escreva um programa que determine se dois arrays unidimensionais de números inteiros são iguais. Crie dois arrays de tamanho 5, leia 5 itens para cada array e depois compare-os.
 */
public class questão_12_protrabalho {
    public static void main(String[] args) {
        int vet1_a[];
        vet1_a =  new int[5];
        int vet2_a[];
        vet2_a =  new int[5];
        int cont; 
        int resp = 0;
        int flag = 0;
        
        for(cont=0;cont<vet1_a.length;cont++){
            vet1_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero1"));
        }
        
        for(cont=0;cont<vet2_a.length;cont++){
            vet2_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero2"));
        }
        
        do{
            for(cont=0;cont<vet1_a.length;cont++){
                if(vet1_a[cont] == vet2_a[cont]){
                }
                else{
                flag = 1;
                }
            }
            resp = 1;
        }while(resp==0); 
        
        if(flag == 1){
        JOptionPane.showMessageDialog(null,"DIFERENTES");
        }
        else{
        JOptionPane.showMessageDialog(null,"IGUAIS");    
        }
    }
}
