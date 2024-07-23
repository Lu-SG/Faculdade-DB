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
public class questão_02 {
    public static void main(String[] args) {
    float qntgasolina, precogasolina, valorpagamento;
    int resp;    
    
    do{
        String s_precogasolina = JOptionPane.showInputDialog("Informe o preco da gasolina:");
        precogasolina = Float.parseFloat(s_precogasolina);      
    
        String s_valorpagamento = JOptionPane.showInputDialog("Informe o valor pago:");
        valorpagamento = Float.parseFloat(s_valorpagamento);      
    
        qntgasolina = valorpagamento/ precogasolina;
        
        JOptionPane.showMessageDialog(null, "Quantidade de gasolina:"+qntgasolina);
 
        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);

    }while(resp==1);

    
}
}
