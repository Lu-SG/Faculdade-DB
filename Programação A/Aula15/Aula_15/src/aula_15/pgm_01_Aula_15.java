/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_15;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_01_Aula_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []JogoSena;//declaração
        
        JogoSena=new int[6];//construção
        
        JogoSena[0] = 23;//inicialização posição 0
        JogoSena[1] = 12;//inicialização posição 1
        JogoSena[2] = 55;//inicialização posição 2
        JogoSena[3] = 02;//inicialização posição 3
        JogoSena[4] = 07;//inicialização posição 4
        JogoSena[5] = 19;//inicialização posição 5
        
        int soma = JogoSena[3] + JogoSena[2];
        
        String JogoSena_s0 = JOptionPane.showInputDialog("Informe o valor da 1 posição:");
        JogoSena[0] = Integer.parseInt(JogoSena_s0);  
        
        String JogoSena_s1 = JOptionPane.showInputDialog("Informe o valor da 2 posição:");
        JogoSena[1] = Integer.parseInt(JogoSena_s1);
        
        String JogoSena_s2 = JOptionPane.showInputDialog("Informe o valor da 3 posição:");
        JogoSena[2] = Integer.parseInt(JogoSena_s2);
        
        String JogoSena_s3 = JOptionPane.showInputDialog("Informe o valor da 4 posição:");
        JogoSena[3] = Integer.parseInt(JogoSena_s3);
        
        String JogoSena_s4 = JOptionPane.showInputDialog("Informe o valor da 5 posição:");
        JogoSena[4] = Integer.parseInt(JogoSena_s4);
        
        String JogoSena_s5 = JOptionPane.showInputDialog("Informe o valor da 6 posição:");
        JogoSena[5] = Integer.parseInt(JogoSena_s5);
        
        JOptionPane.showMessageDialog(null,""+JogoSena[0]+"\n"+JogoSena[1]+"\n"+JogoSena[2]+"\n"+JogoSena[3]+"\n"+JogoSena[4]+"\n"+JogoSena[5]);
        
        
        
        
        System.out.println("Valores:"+JogoSena[0]+JogoSena[1]+JogoSena[2]+JogoSena[3]+JogoSena[4]+JogoSena[5]);
        System.out.println(JogoSena[2]+JogoSena[3]);
        System.out.println("Valor da soma:"+soma);
        
        
    }
    
}
