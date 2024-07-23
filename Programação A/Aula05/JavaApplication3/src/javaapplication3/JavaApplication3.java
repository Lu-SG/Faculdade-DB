package javaapplication3;
import javax.swing.JOptionPane;
public class JavaApplication3 {

  
    public static void main(String[] args) {
     JOptionPane.showMessageDialog(null,"Hello World");
     String nome = JOptionPane.showInputDialog(null,"Informe seu \n Nome");
     JOptionPane.showMessageDialog(null,"Seu nome é"+nome);
     String s_idade = JOptionPane.showInputDialog(null,"Informe sua \n Idade");
     int idade = Integer.parseInt(s_idade);
     if (idade>=18){
         JOptionPane.showMessageDialog(null,"Entrada Permitida");
     } 
     else {
         JOptionPane.showMessageDialog(null,"Entrada Negada");
     }
    
}
}
