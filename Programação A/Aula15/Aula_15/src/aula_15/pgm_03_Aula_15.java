/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_15;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_03_Aula_15 {
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont;
        
        int []JogoSena;//declaração
        JogoSena=new int[6];//construção
                
        int tamanho_array = JogoSena.length;
        
        for(cont=0;cont<tamanho_array;cont++){        
            String JogoSena_s = JOptionPane.showInputDialog("Informe o valor da "+(cont+1)+" posição:");
            JogoSena[cont] = Integer.parseInt(JogoSena_s);      
        } 
        
        for(cont=0;cont<tamanho_array;cont++){        
            if(JogoSena[cont]==7){
                JOptionPane.showMessageDialog(null, "Parabéns, tu digitou 7");
            }
        }
        
        for(cont=0;cont<JogoSena.length;cont++){        
            JOptionPane.showMessageDialog(null,""+JogoSena[cont]);
        } 
    }    
}
