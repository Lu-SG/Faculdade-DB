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
public class questão_06 {
     public static void main(String[] args) {  
     int idade, qntanos, qntmeses, qntdias;
     int resp;
     do{
         
     String s_qntanos = JOptionPane.showInputDialog("Informe quantidade de Anos");
     qntanos = Integer.parseInt(s_qntanos);    
     
     String s_qntmeses = JOptionPane.showInputDialog("Informe quantidade de Meses");
     qntmeses = Integer.parseInt(s_qntmeses); 
     
     String s_qntdias = JOptionPane.showInputDialog("Informe quantidade de Dias");
     qntdias = Integer.parseInt(s_qntdias); 
     
     idade = qntanos * 365 + qntmeses * 30 + qntdias;
     
     JOptionPane.showMessageDialog(null, "Quantidade de dias de vida:"+idade);
    
     String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
     resp = Integer.parseInt(s_resp);
     
     }while(resp==1);
    }
}