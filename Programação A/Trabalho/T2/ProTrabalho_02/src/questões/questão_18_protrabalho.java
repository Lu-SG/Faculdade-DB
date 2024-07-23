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
 * 19)Escreva um main Java que solicita 8 inteiros ao usuário e guarda esses valores em um array. Depois o programa deve descobrir e exibir qual a posição do elemento de maior valor.
 */
public class questão_18_protrabalho {
    public static void main(String[] args) {
    int vet_a[];
        vet_a= new int[8];
        int maiornumero = 0;
        int posicaomaiornumero = 0;
        int cont;
         
        for(cont=0;cont<vet_a.length;cont++){
            vet_a[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe Número"));
            if(vet_a[cont]>maiornumero){
                maiornumero = vet_a[cont];
                posicaomaiornumero = cont;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O maior valor desse Array é: "+maiornumero+" e está na posição: "+posicaomaiornumero+" dentro do Array.");
        
         
         
     }    
}
