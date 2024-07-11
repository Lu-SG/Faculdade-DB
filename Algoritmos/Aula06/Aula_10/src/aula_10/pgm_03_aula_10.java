/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_10;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_03_aula_10 {
    public static void main(String[] args) {
                // TODO code application logic here    
            int cont;
            int n1;
            int contpar = 0, contimpar = 0; 
            int resp = 0;
            
            do{
                String s_n1 = JOptionPane.showInputDialog("Informe número desejado");
                n1 =  Integer.parseInt(s_n1);
                
                for(cont=1;cont<=10;cont++){
                    if(cont*n1 % 2 == 0){
                        contpar++;
                    }    
                    else{
                        contimpar++;
                    }
                    System.out.println("O valor  do i = "+cont+"X"+n1+" = "+cont*n1+"\n"+"valor de impares "+contimpar+"\n"+"valor de pares "+contpar);         
                }
                
                String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
                resp = Integer.parseInt(s_resp);         
            }while(resp == 1);    
                    
    }            
}
