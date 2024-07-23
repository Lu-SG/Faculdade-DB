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
public class questão_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float distanciatotal, totalgasto, consumomédio;
        int resp ;
        
        do
        {
            String s_distanciatotal = JOptionPane.showInputDialog("Informe a distancia percorrida:");
            distanciatotal = Float.parseFloat(s_distanciatotal);    

            String s_totalgasto = JOptionPane.showInputDialog("Informe o total gasto:");
            totalgasto = Float.parseFloat(s_totalgasto);    

            consumomédio = distanciatotal / totalgasto;
            
            JOptionPane.showMessageDialog(null, "O consume médio é de:"+consumomédio);
            
            String s_resp = JOptionPane.showInputDialog("Você quer continuar?\n1 - SIM\n2 - NÃO");
            resp = Integer.parseInt(s_resp);
        
        }while(resp==1);
            
        
    
    
    }    
}
