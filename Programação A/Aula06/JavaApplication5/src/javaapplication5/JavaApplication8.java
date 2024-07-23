/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import javax.swing.JOptionPane;
/**
 *
 * @author LucasSilvaGarcia
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    float media;
    
    String s_n1 = JOptionPane.showInputDialog(null,"Informe n1"); 
    float f_n1 = Float.parseFloat(s_n1);
    
    String s_n2 = JOptionPane.showInputDialog(null,"Informe n2"); 
    float f_n2 = Float.parseFloat(s_n2);
    
    String s_n3 = JOptionPane.showInputDialog(null,"Informe n3"); 
    float f_n3 = Float.parseFloat(s_n3);
    
    media = (f_n1 + f_n2 + f_n3)/3;
    
    if (media>=7){
        JOptionPane.showMessageDialog(null,"Sua média:"+media);
        JOptionPane.showMessageDialog(null,"APROVADO :)");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Sua média:"+media);
        JOptionPane.showMessageDialog(null,"REPROVADO :(");
    }
    
    
    
    
    
    }
/*    
String peso = "15";

float f_peso = Float.parseFloat(peso);
*/





   
}