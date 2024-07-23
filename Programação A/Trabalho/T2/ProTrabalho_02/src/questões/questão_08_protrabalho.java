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
 * 8)Faça um programa que leia um array de 10 valores de inteiros chamado a e um valor inteiro x e mostre a quantidade de vezes que x aparece no array a.


 */
public class questão_08_protrabalho {
    public static void main(String[] args) {
        int vetor[];
        vetor = new int[10];
        int cont;
        int cont_qnt_1 = 0;
        for(cont=0;cont<(vetor.length);cont++){
            vetor[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));    
            if(vetor[cont]==1){
                cont_qnt_1++;    
            }
        } 
        JOptionPane.showMessageDialog(null,""+cont_qnt_1++);
    }
}
