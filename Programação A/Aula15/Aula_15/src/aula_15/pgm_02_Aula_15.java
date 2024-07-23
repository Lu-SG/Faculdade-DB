package aula_15;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm_02_Aula_15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int []JogoSena;//declaração
        
        JogoSena=new int[6];//construção
        
        int soma = JogoSena[3] + JogoSena[2];
        
        String JogoSena_s0 = JOptionPane.showInputDialog("Informe o valor da 1 posição:");
        JogoSena[0] = Integer.parseInt(JogoSena_s0);  
        
        String JogoSena_s1 = JOptionPane.showInputDialog("Informe o valor da 2 posição:");
        JogoSena[1] = Integer.parseInt(JogoSena_s1);
        
        String JogoSena_s2 = JOptionPane.showInputDialog("Informe o valor da 3 posição:");
        JogoSena[2] = Integer.parseInt(JogoSena_s2);
        
        if(JogoSena[0]==7 || JogoSena[1]==7 || JogoSena[2]==7){
            JOptionPane.showMessageDialog(null, "Parabens, tu ganhou nada!");
        }
        
        JOptionPane.showMessageDialog(null,""+JogoSena[0]+"\n"+JogoSena[1]+"\n"+JogoSena[2]);
        
        
        
        
        System.out.println("Valores:"+JogoSena[0]+JogoSena[1]+JogoSena[2]+JogoSena[3]+JogoSena[4]+JogoSena[5]);
        System.out.println(JogoSena[2]+JogoSena[3]);
        System.out.println("Valor da soma:"+soma);
    }
}
