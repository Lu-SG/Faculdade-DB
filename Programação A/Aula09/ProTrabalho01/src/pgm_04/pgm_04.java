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
/*
4)Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
disponíveis com o usuário.
*/
public class pgm_04 {
    public static void main(String[] args) {
        
            float cotacaodolar, qntdolar, qntreais;
            int resp;

            do{
                String s_cotacaodolar = JOptionPane.showInputDialog("Informe a cotação do dólar de hoje");
                cotacaodolar = Float.parseFloat(s_cotacaodolar);

                String s_qntdolar = JOptionPane.showInputDialog("Informe a quantidade de doláres");
                qntdolar = Float.parseFloat(s_qntdolar);

                qntreais = qntdolar * cotacaodolar;

                JOptionPane.showMessageDialog(null, "A quantidade de reais disponíveis é de:"+qntreais);

                String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
                resp = Integer.parseInt(s_resp);

                }while(resp==1);
    
    }    
}
