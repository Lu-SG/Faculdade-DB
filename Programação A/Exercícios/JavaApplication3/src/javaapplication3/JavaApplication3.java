/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String s_n1 = JOptionPane.showInputDialog(null,"N1");
    float n1 = Integer.parseInt(s_n1);
    
    String s_n2 = JOptionPane.showInputDialog(null,"N2");
    float n2 = Integer.parseInt(s_n2);
    
    float som, sub, div, resto, pro;
    
    som = n1 + n2;
    sub = n1 - n2;
    div = n1 / n2;
    resto = n1 % n2;
    pro = n1 * n2;
    
    JOptionPane.showMessageDialog(null,"SOMA"+som);
    JOptionPane.showMessageDialog(null,"SUBTRACAO"+sub);
    JOptionPane.showMessageDialog(null,"DIVISÃO"+div);
    JOptionPane.showMessageDialog(null,"RESTO"+resto);
    JOptionPane.showMessageDialog(null,"PRODUTO"+pro);
    
    
    
    }
    
    
    
    
    
    
    
    }
    
}
