
package javaapplication5;
import javax.swing.JOptionPane;
       
/**
 *
 * @author LucasSilvaGarcia
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String s_anonasc = JOptionPane.showInputDialog(null,"Informe o seu ano de nascimento"); 
        int anonasc = Integer.parseInt(s_anonasc);
        
        String s_anoatual = JOptionPane.showInputDialog(null,"Informe o atual ano"); 
        int anoatual = Integer.parseInt(s_anoatual);
       
        int idade = anoatual - anonasc; 
        
        if (idade<18)
        {
            JOptionPane.showInputDialog(null,"sua idade é",+idade);
            JOptionPane.showInputDialog(null,"Tu és novo");
        }
        else if (idade==18)
        {
            JOptionPane.showInputDialog(null,"sua idade é",+idade);
            JOptionPane.showInputDialog(null,"Tu és novo");
        }
        else 
        {
            JOptionPane.showInputDialog(null,"sua idade é",+idade);
            JOptionPane.showInputDialog(null,"Tu és adulto");
        }    
    }
    
}
