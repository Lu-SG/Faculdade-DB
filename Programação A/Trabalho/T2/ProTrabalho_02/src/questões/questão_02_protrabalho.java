/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões;
import javax.swing.JOptionPane;
//2 . Ler dez números e mostrar a média dos números impares.
/**
 *
 * @author LucasSilvaGarcia
 */

public class questão_02_protrabalho {
    public static void main(String[] args) {
    int nu_i, somanuimpares = 0, contnuimpares = 0;
    float medianuimpares;
    int cont;
    
    for(cont=0;cont<10;cont++){    
        String nu_s = JOptionPane.showInputDialog("Insira Numero");
        nu_i = Integer.parseInt(nu_s);
        
        if(nu_i % 2 != 0){
            somanuimpares += nu_i;
            contnuimpares++;
        }
    }
    
    medianuimpares = (float)somanuimpares / contnuimpares++;
    JOptionPane.showMessageDialog(null, "A media dos numeros impares é de:"+medianuimpares);
    }    
}
