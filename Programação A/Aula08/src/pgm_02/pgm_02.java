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
public class pgm_02 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float consumomedio, distanciatotal, totalconsumo;
        int escolha;
        do{
            String s_distanciatotal = JOptionPane.showInputDialog("Informe distancia total percorrida!");
            distanciatotal = Float.parseFloat(s_distanciatotal);
            
            String s_totalconsumo = JOptionPane.showInputDialog("Informe consumo total da distancia total percorrida!");
            totalconsumo = Float.parseFloat(s_totalconsumo);
            
            consumomedio = distanciatotal/totalconsumo;
            
            JOptionPane.showMessageDialog(null,"Seu consumo médio foi de:"+consumomedio);
            
            String s_escolha = JOptionPane.showInputDialog("Gostaria de Iniciar?\n 1 -  SIM\n 2 -  NÃO");
            escolha  = Integer.parseInt(s_escolha);
            
        } while (escolha==1);
        
        JOptionPane.showMessageDialog(null,"Você saiu do sistema");
}
}
