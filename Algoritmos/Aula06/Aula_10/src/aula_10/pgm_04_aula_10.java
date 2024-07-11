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
public class pgm_04_aula_10 {
    public static void main(String[] args) {
        
        int resp = 1;
        
        while(resp==1){
            String s_escolha = JOptionPane.showInputDialog(null,"A - ALTERAÇÃO\nI - INCLUSÃO\nE - EXCLUSÃO\nP - PESQUISA");
            char choice = s_escolha.charAt(0); 
            
            switch(choice){
                case 'A': JOptionPane.showMessageDialog(null,"ALTERAÇÃO");
                break;        

                case 'I': JOptionPane.showMessageDialog(null,"INCLUSÃO");
                break;        

                case 'E': JOptionPane.showMessageDialog(null,"EXCLUSÃO");
                break;  

                case 'P': JOptionPane.showMessageDialog(null,"PESQUISA");
                break;  

                default: JOptionPane.showMessageDialog(null,"DEFAULT");        
            }    
        
        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);
        }
    }
}
