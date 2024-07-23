/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_01;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 1;
        double b = 200000;
        int contpar = 0;
        int contimpar = 0;
                
        
        
        
        while (a<=b){
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
        System.out.println("PAR = "+contpar);
        System.out.println("IMPAR = "+contimpar);
        } 
    }
    

