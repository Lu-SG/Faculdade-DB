/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Faça um programa que leia as 3 notas de um aluno e calcule a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente
*/
package javaapplication5;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s_n1 = JOptionPane.showInputDialog(null,"N1");
        int n1 = Integer.parseInt(s_n1);
        
        String s_n2 = JOptionPane.showInputDialog(null,"N2");
        int n2 = Integer.parseInt(s_n2);
        
        String s_n3 = JOptionPane.showInputDialog(null,"N3");
        int n3 = Integer.parseInt(s_n3);
        
        double nota1, nota2, nota3, media;
        
        nota1 = n1*0.2;
        nota2 = n2*0.3;
        nota3 = n3*0.5;
        
        media = nota1+nota2+nota3;
        
        JOptionPane.showMessageDialog(null,"MEDIA"+media);
        
        
        
        
    }
    
}
