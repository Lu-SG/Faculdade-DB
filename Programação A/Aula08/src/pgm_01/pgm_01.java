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
        
        int escolha;
        do {
            
            System.out.println("ok");
            String s_escolha = JOptionPane.showInputDialog(null,"Escolha, 1 / 2!!");
            escolha = Integer.parseInt(s_escolha);
        
        } while (escolha==1);
        
        JOptionPane.showMessageDialog(null,"Você saiu do sistesma");

        
    }
    
}
