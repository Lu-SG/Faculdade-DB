/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_01;
import javax.swing.JOptionPane;
/**
 *
 * @author LucasSilvaGarcia
 */
/*
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada
pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a
venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
quantidades de pães e de broas, e depois calcular os dados solicitados
*/
public class pgm_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qntpaes, qntbroas;
        float valortotalpaes = 0, valortotalbroas = 0, valortotal, valorpoupança;
        int resp; 
        
       
        do{
        String s_qntpaes = JOptionPane.showInputDialog("Informe a quantidade de pães");
        qntpaes = Integer.parseInt(s_qntpaes);
        
        if (qntpaes>0){
            valortotalpaes = qntpaes * (float)0.12;
        }    
        String s_qntbroas = JOptionPane.showInputDialog("Informe a quantidade de broas");
        qntbroas = Integer.parseInt(s_qntbroas);
        
        if (qntbroas>0){
            valortotalbroas = qntbroas * (float)1.50;
        }
        
        valortotal = valortotalpaes + valortotalbroas;
        
        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);
        
        }while(resp==1);    
                
        valorpoupança = valortotal * (float)0.10;  
        
        JOptionPane.showMessageDialog(null,"O Valor total arrecadado é de:"+valortotal);
        JOptionPane.showMessageDialog(null,"O Valor a ser poupado é de:"+valorpoupança);
        
    }
    
}
