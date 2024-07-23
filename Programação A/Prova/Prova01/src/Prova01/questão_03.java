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
public class questão_03 {
    public static void main(String[] args) {   
        
        int qntpequenas, qntmedias, qntgrandes;
        float vlrpequenas = 0, vlrmedias = 0, vlrgrandes = 0, vlrtotal; 
        int resp1;

        do{

            String s_qntpequenas = JOptionPane.showInputDialog("Informe quantidade de camisetas PEQUENAS\nCASO NÃO TENHA DIGITE '0'");
            qntpequenas = Integer.parseInt(s_qntpequenas);

            if (qntpequenas>0){
                vlrpequenas = vlrpequenas + (qntpequenas * 15);
            }
            String s_qntmedias = JOptionPane.showInputDialog("Informe quantidade de camisetas MEDIAS\nCASO NÃO TENHA DIGITE '0'");
            qntmedias = Integer.parseInt(s_qntmedias);

            if (qntmedias>0){
                vlrmedias = vlrmedias + (qntmedias * 20);
            }

            String s_qntgrandes = JOptionPane.showInputDialog("Informe quantidade de camisetas GRANDES\nCASO NÃO TENHA DIGITE '0'");
            qntgrandes = Integer.parseInt(s_qntgrandes);

            if (qntgrandes>0){
                vlrgrandes = vlrgrandes + (qntgrandes * 25);
            }   

            vlrtotal = vlrpequenas + vlrmedias + vlrgrandes;

            String s_resp1 = JOptionPane.showInputDialog("Você quer finalizar a venda?\n1 - SIM\n2 - NÃO");
            resp1 = Integer.parseInt(s_resp1);     

        } while(resp1==2);

        JOptionPane.showMessageDialog(null,"Valor TOTAL:"+vlrtotal);    
            
    }
}    
