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
 * 9)Crie um programa que leia o número de pessoas e armazene na variável x. Declare e crie um array de tamanho x do tipo String. Faça um laço que executa um bloco de código x vezes, solicita um nome completo ao usuário e insere no array, preenchendo todas as posições dele.


 */
public class questão_09_protrabalho {
    public static void main(String[] args) {
    int nu;
    int cont;
    
    nu = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
    
    String vetor[];
    vetor = new String[nu];
    
    for(cont=0;cont<vetor.length;cont++){
        vetor[cont] = JOptionPane.showInputDialog("Insira NOME COMPLETO:");
    }
    
    }
}
