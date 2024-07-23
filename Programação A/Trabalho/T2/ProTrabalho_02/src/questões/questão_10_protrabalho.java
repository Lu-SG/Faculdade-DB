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
 * Escrever um main Java que lê 20 números reais e armazena esses valores em um array. O programa deve calcular a média aritmética dos valores do vetor e imprimir todos os valores menores do que a média calculada
 */
public class questão_10_protrabalho {
    public static void main(String[] args) {
    int n1_i;
    int n1_a[];
    n1_a = new int [20];
    int cont;
    int soman1_i = 0;
    float media_n1_f;
    
    for(cont=0;cont<n1_a.length;cont++){
        n1_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero"));
        soman1_i += n1_a[cont];
    }
    
    media_n1_f = soman1_i / n1_a.length;
    
    for(cont=0;cont<n1_a.length;cont++){
        if(n1_a[cont]<media_n1_f){
            JOptionPane.showMessageDialog(null,""+n1_a[cont]);
        }
    }
    
    }
    
}
