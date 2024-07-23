/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm_02;
import javax.swing.JOptionPane;
/**
 *
 * @author LucasSilvaGarcia
 */
/*
2)Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro
da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque.
*/
public class pgm_02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float valortotalgasolina, precogasolina, qntgasolina;
    int resp;
    
    do{
        String s_precogasolina = JOptionPane.showInputDialog("Informe o preço da gasolina");
        precogasolina = Float.parseFloat(s_precogasolina);    
        
        String s_valortotalgasolina = JOptionPane.showInputDialog("Informe o valor pago");
        valortotalgasolina = Float.parseFloat(s_valortotalgasolina);    
        
        qntgasolina = valortotalgasolina / precogasolina;
        
        JOptionPane.showMessageDialog(null, "A quantidade de gasolina obtida foi de:"+qntgasolina);
        
        String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
        resp = Integer.parseInt(s_resp);
    }while(resp==1);
    
    }
}    
