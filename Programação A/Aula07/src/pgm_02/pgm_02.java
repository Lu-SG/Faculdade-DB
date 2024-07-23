/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_02;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_02 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double a = 1;
        double b = 100;
        int contpar = 0;
        int contimpar = 0;
        
        while (a<=b){
            
            String s_n1 = JOptionPane.showInputDialog(null,"Quer entrar no sistema? SIM [1]\n NÃO[0]");
            int i_n1 = Integer.parseInt(s_n1);
            
            if (i_n1 == 1){
                
                if (a % 2 == 0){
                    System.out.println("valor de a="+a);
                    a++;
                    System.out.println("PAR");
                    contpar++;
                }
                else{
                System.out.println("valor de a="+a);
                a++;
                System.out.println("IMPAR");
                contimpar++;    
                }
            }
            else{
                a = b + 1;    
            }
        }
            
        System.out.println("PAR = "+contpar);
        System.out.println("IMPAR = "+contimpar);
    }
}   

