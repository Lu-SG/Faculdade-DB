/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova01;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas
 */
public class questão_05 {
    public static void main(String[] args) {   
        float media;
    
    String s_n1 = JOptionPane.showInputDialog(null,"Informe n1"); 
    float f_n1 = Float.parseFloat(s_n1);
    
    String s_n2 = JOptionPane.showInputDialog(null,"Informe n2"); 
    float f_n2 = Float.parseFloat(s_n2);
    
    String s_n3 = JOptionPane.showInputDialog(null,"Informe n3"); 
    float f_n3 = Float.parseFloat(s_n3);
    
    String s_n4 = JOptionPane.showInputDialog(null,"Informe n4"); 
    float f_n4 = Float.parseFloat(s_n4);
    
    String s_n5 = JOptionPane.showInputDialog(null,"Informe n5"); 
    float f_n5 = Float.parseFloat(s_n5);
    
    media = (f_n1 + f_n2 + f_n3 + f_n4 + f_n5)/5;
    
    JOptionPane.showMessageDialog(null,"Sua média:"+media);
    
    }
}
