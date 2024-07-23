/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas
 * 16) Escrever um programa que lê um vetor X(10) e o escreve. Leia um valor inteiro e diga se este valor encontra- se em X e quantas vezes.
 */
public class questão_17_protrabalho {
    public static void main(String[] args) {
        int vet_a[];
        vet_a = new int[10];
        int nu_pesquisa, qnt_nu_pesquisa = 0;
        int cont;
        
        for(cont=0;cont<vet_a.length;cont++){
            vet_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira Numero Inteiro"));
        }
        
        nu_pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Insira numero que deseja pesquisar:"));
        
        for(cont=0;cont<vet_a.length;cont++){
            if(vet_a[cont] == nu_pesquisa){
                qnt_nu_pesquisa++;
            }
        }
        
        if(qnt_nu_pesquisa>0){
            JOptionPane.showMessageDialog(null, "O numero "+nu_pesquisa+" Encontra-se no vetor "+qnt_nu_pesquisa+" vezes");
        }
        else{
            JOptionPane.showMessageDialog(null, "O numero "+nu_pesquisa+" Não Encontra-se no vetor ");
        }
    }    
}
