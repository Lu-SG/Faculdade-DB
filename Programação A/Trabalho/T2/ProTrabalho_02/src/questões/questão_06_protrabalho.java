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
 * Escreva que leia um array de double de 10 valores e que exiba os valores de um array a double numa mesma linha.
 */
public class questão_06_protrabalho {
    public static void main(String[] args) {
    double array[];
    array = new double [10];
    int cont;
    String resultado = "";
    for(cont=0;cont<10;cont++){
        array[cont] = Double.parseDouble(JOptionPane.showInputDialog("Insira um número DOUBLE:"));    
    }    
    
    
    for(cont=0;cont<10;cont++){
        resultado =  resultado +"   "+ (array[cont]);
    }
    
        System.out.println(""+resultado);
    }
}
