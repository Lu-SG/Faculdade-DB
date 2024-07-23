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
 * 14) Leia 2 vetores de 10 posições de elementos inteiros. Criar um 3 vetor que seja soma dos dois vetores.
 */
public class questão_14_protrabalho {
    public static void main(String[] args) {
        int vet1_a[];
        vet1_a =  new int[10]; 
        int vet2_a[];
        vet2_a =  new int[10]; 
        int vet3_a[];
        vet3_a =  new int[10]; 
        
        int cont;
        
        for(cont=0;cont<vet1_a.length;cont++){
            vet1_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero1"));
        }
        
        for(cont=0;cont<vet2_a.length;cont++){
            vet2_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero2"));
        }
        
        for(cont=0;cont<vet3_a.length;cont++){
            vet3_a[cont] = vet1_a[cont] + vet2_a[cont];
        }
        
         for(cont=0;cont<vet3_a.length;cont++){
             System.out.println(""+vet3_a[cont]);
         }    
    }
}
