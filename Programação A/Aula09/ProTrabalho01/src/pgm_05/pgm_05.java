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
/*
3) Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um
programa que receba um valor de uma compra e mostre o valor das prestações.
*/
public class pgm_05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    float valortotalcompra, valorprestacao;    
    int qntprestacoes, resp;
    
    do{
        String s_valortotalcompra = JOptionPane.showInputDialog("Informe o preço total da compra");
        valortotalcompra = Float.parseFloat(s_valortotalcompra);    
        
        String s_qntprestacoes = JOptionPane.showInputDialog("Informe a quantidade de prestações");
        qntprestacoes = Integer.parseInt(s_qntprestacoes);
        
        valorprestacao = valortotalcompra / qntprestacoes;
        
        JOptionPane.showMessageDialog(null, "O valor de cada prestação é de:"+valorprestacao);
        
        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);
    }while(resp==1);    
    }
}