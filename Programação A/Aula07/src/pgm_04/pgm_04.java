/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_04;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_04 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int escolha = 1;
        int cont = 0;
        int contpar = 0;
        int contimpar = 0;
        int resto;
        while (escolha==1){
            String s_ler_usuario = JOptionPane.showInputDialog(null,"1 Para Continuar\n0 Para Sair");
            escolha = Integer.parseInt(s_ler_usuario);
        
            if (escolha == 1){
                cont++;
            }
            resto = cont % 2;
            if (resto==0){
                contpar++;
            }
            else 
            {
                contimpar++;
            }
            JOptionPane.showMessageDialog(null, "Contagem até agora:"+cont);
        }
        
        JOptionPane.showMessageDialog(null,"Você saiu do sistesma");
        JOptionPane.showMessageDialog(null, "Quantas vezes tu entrou:"+cont);
        JOptionPane.showMessageDialog(null, "Quantas vezes a contagem foi par:"+contpar);
        JOptionPane.showMessageDialog(null, "Quantas vezes a contagem foi impar:"+contimpar);
    }
}       
