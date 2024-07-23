/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm03;
import javax.swing.JOptionPane;
/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_03 {
    public static void main(String[] args) {
    
    float quantidadegasolina, precogasolina,valorpagamento;
    int escolha;
   
    do{
    String s_precogasolina = JOptionPane.showInputDialog("Informe preço gasolina:");
    precogasolina = Float.parseFloat(s_precogasolina);    
    
    String s_valorpagamento = JOptionPane.showInputDialog("Informe valor pago:");
    valorpagamento = Float.parseFloat(s_valorpagamento);    
    
    quantidadegasolina = valorpagamento / precogasolina;
   
    JOptionPane.showMessageDialog(null, "A quantidade de gasolina colocada foi de:"+quantidadegasolina);
    
    String s_escolha = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
    escolha = Integer.parseInt(s_escolha);   
    
    } while(escolha==1);
    }
}