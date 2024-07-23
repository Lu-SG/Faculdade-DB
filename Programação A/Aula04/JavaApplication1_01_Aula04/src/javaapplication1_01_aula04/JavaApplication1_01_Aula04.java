/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1_01_aula04;

/**
 *
 * @author LucasSilvaGarcia
 */
public class JavaApplication1_01_Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Conversões explícitastg
        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        
        c = 65;
        b = 10;
        s = b;
        i = s;
        
        System.out.println("===");
        System.out.println("char");
        System.out.println("===");
        System.out.println("valor de c como char=" +c);
        System.out.printf("%d\n",(int)c);
        System.out.println("===");
        
        System.out.println("===");
        System.out.println("Inteiros");
        System.out.println("===");
        System.out.println("i=s=b"+i);
        
        i *= 100;
        //i = i * 100
        System.out.println("novo valor de i="+i);
        
        b = (byte)i;
        System.out.println("novo valor de b= "+b);
        //Por que valor é -24?
        /*
        Saida da impressão:
        novo valor de b = -24
        caso bem raro, devido perca de precisão
        */
        d = (float)125.31999969482422;
        f = (float)125.32;
        System.out.println("valor de f =" +d );
        f = 125.32f;
        System.out.println("valor de f =" +d );
        f = (float)125.32d;
        System.out.println("valor de f =" +d );
        System.out.println("===");
        
        
      
        
        
    }
    
}
