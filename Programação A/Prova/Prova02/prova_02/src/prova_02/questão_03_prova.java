/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_02;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class questão_03_prova {
    public static void main(String[] args) {
        // TODO code application logic here
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
