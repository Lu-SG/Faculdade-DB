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
public class pgm_01_aula_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cont;
        int n1;
        
        String s_n1 = JOptionPane.showInputDialog("Informe número desejado");
        n1 =  Integer.parseInt(s_n1);
        
        for(cont=1;cont<=10;cont++){
        System.out.println("O valor  do i ="+cont+"X"+n1+"="+cont*n1);         
        }
    }
    
}
