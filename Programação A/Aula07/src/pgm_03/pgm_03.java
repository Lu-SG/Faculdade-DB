/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_03;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_03 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int escolha = 1;
        
        while (escolha==1){
        String s_ler_usuario = JOptionPane.showInputDialog(null,"1 Para Continuar\n0 Para Sair");
        escolha = Integer.parseInt(s_ler_usuario);
        }
        JOptionPane.showMessageDialog(null,"Você saiu do sistesma");
    
    
    }
}       

