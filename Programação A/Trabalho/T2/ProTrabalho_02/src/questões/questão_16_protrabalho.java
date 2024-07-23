/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 * 16) Escrever um programa que leia 2 vetores de 5 posições cada e depois crie um terceiro vetor de 10 posições que contenha os elementos dos outros 2 vetores.


 */
public class questão_16_protrabalho {
    public static void main(String[] args) {
        int vet1_a[];
        vet1_a =  new int[5]; 
        int vet2_a[];
        vet2_a =  new int[5];
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
            
            if(cont<5){
                vet3_a[cont] =  vet1_a[cont];
                System.out.println("ENTREI <5"+cont+""+vet3_a[cont]);
            }
            
            if(cont>=5){
                System.out.println("ENTREI >=5"+cont+vet3_a[cont]);
                vet3_a[cont] =  vet2_a[cont];
            }
            
        }
        
        for(cont=0;cont<vet3_a.length;cont++){
            System.out.println(""+vet3_a[cont]);
        }
        
    }
}    


