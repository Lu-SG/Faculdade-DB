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
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float valorvenda = 0;
     
    String s_qntcompradas = JOptionPane.showInputDialog(null,"Quantas maças tu pegou???"); 
    int qntcompradas = Integer.parseInt(s_qntcompradas);
    
    if (qntcompradas<12){
        valorvenda = (float)qntcompradas*1.30f;
        JOptionPane.showMessageDialog(null,"O valor da compra ficou:"+valorvenda);
    }
    else if(qntcompradas>=12)
        valorvenda = (float)qntcompradas*1.00f;
        JOptionPane.showMessageDialog(null,"O valor da compra ficou:"+valorvenda);     
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

