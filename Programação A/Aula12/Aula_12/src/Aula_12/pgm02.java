/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12;
import javax.swing.JOptionPane;
/**
 *
 * @author LucasSilvaGarcia
 */
public class pgm02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String nome = JOptionPane.showInputDialog(null,"Insira primeiro nome:");
        String sobrenome = JOptionPane.showInputDialog(null,"Insira sobrenome:");
        String a = "LiliSS";
        String b = "liliS";
        
        String s = a.substring(0,2);
        String c = nome.substring(0,1)+""+sobrenome.substring(0,1);
        
        JOptionPane.showMessageDialog(null,c);
        JOptionPane.showMessageDialog(null,s);
        
        if(a.equals(b)){
            System.out.println("Igual");
        }
        else{
            System.out.println("Diferente");
        }    
        if(a.equalsIgnoreCase(b)){
            System.out.println("Igual1");
        }
        else{
            System.out.println("Diferente1");
        }
        
        System.out.println("Tamanho do a"+a.length()); 
        if(a.length() == b.length()){
            System.out.println("IGUAL");    
        }
        if(a.length() <= b.length()){
            System.out.println("A MENOR");    
        }
        if(a.length() >= b.length()){
            System.out.println("B MENOR");    
        }
       
        System.out.println(nome.charAt(0));
        */
        String s_escolha = JOptionPane.showInputDialog("ESCOLHA: INCLUIR / DELETAR / PESQUISAR / ATUALIZAR");
        
        char escolha_c = s_escolha.charAt(0); 
        
        switch(escolha_c){
            case ('I'):
            {    
                JOptionPane.showMessageDialog(null, "INCLUIR");
                break;
            } 
            case ('D'):
            {    
                JOptionPane.showMessageDialog(null, "DELETAR");
                break;
            }    
            case ('P'):
            {    
                JOptionPane.showMessageDialog(null, "PESQUISAR");
                break;
            }    
            case ('A'):
            {    
                JOptionPane.showMessageDialog(null, "ATUALIZAR");
                break;
            }    
       
            default : System.out.println("Sem tratamento");     
        }
        String caixa_alta = "Lucas";
        System.out.println(caixa_alta.toUpperCase());
        System.out.println(caixa_alta.toLowerCase());
        
        String troca = caixa_alta.replace("Lucas","Leonci    o");
        System.out.println(troca);
    
        System.out.println(troca = troca.trim());
    }    
}
