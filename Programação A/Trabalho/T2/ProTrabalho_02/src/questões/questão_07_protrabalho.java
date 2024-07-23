/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 * Escreva que leia um array de inteiros e retorna a quantidade de elementos do array que são números negativos.
 */
public class questão_07_protrabalho {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        int qnt_nu_negativos = 0;
        int cont;
        System.out.println("Aqui");
        
        for(cont=0;cont<10;cont++){
            array[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));    
            if(array[cont]<0){
                qnt_nu_negativos++;
            }
        }          
        
        JOptionPane.showMessageDialog(null, "A Quantidade de Negativos é"+"\n"+qnt_nu_negativos);
    }
}
