/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s_n1 = JOptionPane.showInputDialog(null,"N1");
        int n1 = Integer.parseInt(s_n1);
        
        String s_n2 = JOptionPane.showInputDialog(null,"N2");
        int n2 = Integer.parseInt(s_n2);
        
        String s_n3 = JOptionPane.showInputDialog(null,"N3");
        int n3 = Integer.parseInt(s_n3);
        
        String s_n4 = JOptionPane.showInputDialog(null,"N4");
        int n4 = Integer.parseInt(s_n4);
        
        String s_n5 = JOptionPane.showInputDialog(null,"N5");
        int n5 = Integer.parseInt(s_n5);
        
        int soma;
        
        soma = n1+n2+n3+n4+n5;
        
        JOptionPane.showMessageDialog(null,"SOMA"+soma);
              
        
                
        
    }
    
}
