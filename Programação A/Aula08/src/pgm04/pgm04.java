/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm04;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm04 {
    
    public static void main(String[] args) {
    
    int qntpequenas, qntmedias, qntgrandes;
    float vlrpequenas = 0, vlrmedias = 0, vlrgrandes = 0, vlrtotal; 
    int resp;
    
    do{
    
        String s_qntpequenas = JOptionPane.showInputDialog("Informe quantidade de camisetas PEQUENAS\nCASO NÃO TENHA DIGITE '0'");
        qntpequenas = Integer.parseInt(s_qntpequenas);

        if (qntpequenas>0){
            vlrpequenas = vlrpequenas + (qntpequenas * 10);
        }
        String s_qntmedias = JOptionPane.showInputDialog("Informe quantidade de camisetas MEDIAS\nCASO NÃO TENHA DIGITE '0'");
        qntmedias = Integer.parseInt(s_qntmedias);

        if (qntmedias>0){
            vlrmedias = vlrmedias + (qntmedias * 12);
        }

        String s_qntgrandes = JOptionPane.showInputDialog("Informe quantidade de camisetas GRANDES\nCASO NÃO TENHA DIGITE '0'");
        qntgrandes = Integer.parseInt(s_qntgrandes);

        if (qntgrandes>0){
            vlrgrandes = vlrgrandes + (qntgrandes * 15);
        }   

        vlrtotal = vlrpequenas + vlrmedias + vlrgrandes;

        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);     
    
    } while(resp==1);
        
    JOptionPane.showMessageDialog(null,"Valor TOTAL:"+vlrtotal);
    
    }
}