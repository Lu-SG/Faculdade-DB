/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Uma certa empresa fez uma pesquisa de mercado para saber se as pessoas gostaram de um novo produto lançado no mercado. Para isso, forneceu o sexo do entrevistado e sua resposta (S/N). Sabendo-se que foram entrevistadas 20 pessoas, fazer um algoritmo que calcule qual a porcentagem de mulheres e de homens que gostaram do produto.
*/
package questões;

/**
 *
 * @author LucasSilvaGarcia
 */
import javax.swing.JOptionPane;
public class questão_01_protrabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont; 
        int ContS = 0, ContN = 0, ContM = 0, ContF = 0, ContSM = 0, ContSF = 0;
        float prctSM, prctSF;
        
        for(cont=0;cont<20;cont++){
            String resposta_s = JOptionPane.showInputDialog("Você Gostou do Produto? S/N");
            if("S".equals(resposta_s))
            {
                ContS++;
            }
            if("N".equals(resposta_s))
            {
                ContN++;
            }
            String sexo_s = JOptionPane.showInputDialog("Qual seu sexo? M/F");
            if("M".equals(sexo_s))
            {
                ContM++;
            }
            if("F".equals(sexo_s))
            {
                ContF++;
            }
            if("S".equals(resposta_s) && "M".equals(sexo_s))
            {
                ContSM++;
            }

            if("S".equals(resposta_s) && "F".equals(sexo_s))
            {
                ContSF++;
            }
        } 
        
        prctSM = (float)ContSM/ContM;
        prctSF = (float)ContSF/ContF;
        
        JOptionPane.showMessageDialog(null, "A % de HOMENS que gostaram é de:"+prctSM);
        JOptionPane.showMessageDialog(null, "A % de MULHERES que gostaram é de:"+prctSF);
    }
    
}
