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
 * Escreva um algoritmo para ler um valor N (validar para aceitar apenas valores positivos). Imprima a seguir “PROGRAMA” N vezes.


 */
public class questão_05_protrabalho {
    public static void main(String[] args) {
    int N_i;
    String N_s = JOptionPane.showInputDialog("Insira N");
    N_i = Integer.parseInt(N_s);
    
    int resp = 0;
    do{
        System.out.println("PROGRAMA");
        resp++;
    
    }while(resp<N_i);   
    }
}
