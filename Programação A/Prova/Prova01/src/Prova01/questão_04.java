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
public class questão_04 {
    public static void main(String[] args) {   
        int qntpaes, qntbroas;
        float valortotalpaes = 0, valortotalbroas = 0, valortotal, valorpoupança;
        int resp; 
        
       
        do{
        String s_qntpaes = JOptionPane.showInputDialog("Informe a quantidade de pães");
        qntpaes = Integer.parseInt(s_qntpaes);
        
        if (qntpaes>0){
            valortotalpaes = qntpaes * (float)0.75;
        }    
        String s_qntbroas = JOptionPane.showInputDialog("Informe a quantidade de broas");
        qntbroas = Integer.parseInt(s_qntbroas);
        
        if (qntbroas>0){
            valortotalbroas = qntbroas * (float)10.99;
        }
        
        valortotal = valortotalpaes + valortotalbroas;
        
        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);
        
        }while(resp==1);    
                
        valorpoupança = valortotal * (float)0.25;  
        
        JOptionPane.showMessageDialog(null,"O Valor total arrecadado é de:"+valortotal);
        JOptionPane.showMessageDialog(null,"O Valor a ser poupado é de:"+valorpoupança);
    }
}
