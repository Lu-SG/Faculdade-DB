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
 * 3) Ler o estado civil de quinze pessoas e mostrar a quantidade de pessoas casadas.
 */
public class questão_03_protrabalho {
    public static void main(String[] args) {
    
    char estado_civil_vetor[];    
    estado_civil_vetor = new char[10];
    char estado_civil_c;
    int qntcasados = 0;
    float prctcasados;
    
    int cont;    
    for(cont=0;cont<4;cont++){    
        String estado_civil_s = JOptionPane.showInputDialog("Insira Estado Civil : União estável / Casado / Viúvo");
        estado_civil_c = estado_civil_s.charAt(0);
        estado_civil_vetor[cont] = estado_civil_c;
        
        if("Casado".equals(estado_civil_s)){
            qntcasados++;
        }    
    }    
    prctcasados = (float)qntcasados / 4;

    JOptionPane.showMessageDialog(null,"A Porcentagem de casados é de:"+prctcasados);
    }
}
