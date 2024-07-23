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
 * Escreva um algoritmo para repetir a leitura de uma senha até que ela seja válida. Para cada leitura da senha incorreta informada escrever a mensagem "SENHA INVÁLIDA". Quanto a senha for informada corretamente deve ser impressa a mensagem "ACESSO PERMITIDO" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
public class questão_04_protrabalho {
    public static void main(String[] args) {
    int resp = 0;
    
    do{    
        String Senha_s = JOptionPane.showInputDialog("Insira SENHA");    
        if("2002".equals(Senha_s)){
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
            resp = 1;
        }
        else{
            JOptionPane.showMessageDialog(null, "SENHA INVÁLIDA");
        }    
    }while(resp==0);
    }
}
