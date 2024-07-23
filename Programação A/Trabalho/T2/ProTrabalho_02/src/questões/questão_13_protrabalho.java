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
 * 13) Escreva um programa que leia, para um array, um conjunto de 10 valores e os apresente por ordem inversa.
 */
public class questão_13_protrabalho {
    public static void main(String[] args) {
        int vet1_a[];
        vet1_a =  new int[10];   
        int cont;
        
        for(cont=0;cont<vet1_a.length;cont++){
            vet1_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero1"));
        }
        
        for(cont=(vet1_a.length-1);cont>=0;cont--){
            JOptionPane.showMessageDialog(null, ""+vet1_a[cont]);
        }
    }
}
