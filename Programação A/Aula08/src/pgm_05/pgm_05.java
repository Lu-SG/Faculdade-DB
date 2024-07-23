/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_05;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_05 {
    public static void main(String[] args) {
        
        int qntpequenas, qntmedias, qntgrandes;
        float qnttotalpequenas = 0, qnttotalmedias = 0, qnttotalgrandes = 0; 
        float vlrpequenas = 0, vlrmedias = 0, vlrgrandes = 0, vlrtotal; 
        
        
        int resp1, resp2;

        do{

            String s_qntpequenas = JOptionPane.showInputDialog("Informe quantidade de camisetas PEQUENAS\nCASO NÃO TENHA DIGITE '0'");
            qntpequenas = Integer.parseInt(s_qntpequenas);

            if (qntpequenas>0){
                vlrpequenas = vlrpequenas + (qntpequenas * 10);
                qnttotalpequenas = qnttotalpequenas + qntpequenas;  
            }
            String s_qntmedias = JOptionPane.showInputDialog("Informe quantidade de camisetas MEDIAS\nCASO NÃO TENHA DIGITE '0'");
            qntmedias = Integer.parseInt(s_qntmedias);

            if (qntmedias>0){
                vlrmedias = vlrmedias + (qntmedias * 12);
                qnttotalmedias = qnttotalmedias + qntmedias;
            }

            String s_qntgrandes = JOptionPane.showInputDialog("Informe quantidade de camisetas GRANDES\nCASO NÃO TENHA DIGITE '0'");
            qntgrandes = Integer.parseInt(s_qntgrandes);

            if (qntgrandes>0){
                vlrgrandes = vlrgrandes + (qntgrandes * 15);
                qnttotalgrandes = qnttotalgrandes + qntgrandes;
            }   

            vlrtotal = vlrpequenas + vlrmedias + vlrgrandes;

            String s_resp1 = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
            resp1 = Integer.parseInt(s_resp1);     

        } while(resp1==1);

        JOptionPane.showMessageDialog(null,"Valor TOTAL:"+vlrtotal);    
        JOptionPane.showMessageDialog(null,"Respectivas quantidades:\nPEQUENAS"+qnttotalpequenas+"\nMEDIAS"+qnttotalmedias+"GRANDES"+qnttotalgrandes);
    
    }     
}
