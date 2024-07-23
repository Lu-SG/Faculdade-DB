package aula_17;
import javax.swing.JOptionPane;


/**
 *
 * @author LucasSilvaGarcia
 */
public class Aula_17_pgm_02 {
    
    public static void main(String[] args) {
        int[] numeros = new int [2];
        int[] numeros6 = new int [2];
        int[] numeros7 = new int [2];
        float[] numeros4 = new float [2];
        double[] numeros3 = new double [2];
        char[] numeros5 = new char [2]; 
        String[] numeros2 = new String [2]; 
        
        
        int cont;
        
        //Entrada
        for(cont=0;cont<numeros.length;cont++){
        String numeros_s = JOptionPane.showInputDialog("Insira um número INT:");
        numeros[cont] = Integer.parseInt(numeros_s);
        }
        
        for(cont=0;cont<numeros2.length;cont++){
        String numeros6_s = JOptionPane.showInputDialog("Insira um número INT:");
        numeros6[cont] = Integer.parseInt(numeros6_s);
        }
        
        for(cont=0;cont<numeros4.length;cont++){
        numeros4[cont] = Float.parseFloat(JOptionPane.showInputDialog("Insira um número FLOAT:"));
        }
        
        for(cont=0;cont<numeros3.length;cont++){
        String numeros3_s = JOptionPane.showInputDialog("Insira um número DOUBLE:");
        numeros3[cont] = Double.parseDouble(numeros3_s);
        }
        
        for(cont=0;cont<numeros5.length;cont++){
        String numeros5_s = JOptionPane.showInputDialog("Insira um caractere CHAR:");
        numeros5[cont] = numeros5_s.charAt(0);
        }
        
        for(cont=0;cont<numeros2.length;cont++){
        String numeros2_s = JOptionPane.showInputDialog("Insira uma String STRING:");
        numeros2[cont] = numeros2_s;
        }
        //Saida
        for(cont=0;cont<numeros.length;cont++){
            JOptionPane.showMessageDialog(null, "O valor INT é:"+numeros[cont]);
        }
        
        for(cont=0;cont<numeros4.length;cont++){
            JOptionPane.showMessageDialog(null, "O valor FLOAT é:"+numeros4[cont]);
        }
        
        for(cont=0;cont<numeros3.length;cont++){
            JOptionPane.showMessageDialog(null, "O valor DOUBLE é:"+numeros3[cont]);
        }
        
        for(cont=0;cont<numeros5.length;cont++){
            JOptionPane.showMessageDialog(null, "O caractere CHAR é:"+numeros5[cont]);
        }
        
        for(cont=0;cont<numeros2.length;cont++){
            JOptionPane.showMessageDialog(null, "A string STRING é:"+numeros2[cont]);
        }
        int soma = 0;
        for(cont=0;cont<numeros.length;cont++){
            soma = soma + numeros[cont];
        }
        System.out.println("O Valor da Soma INT é"+soma);
        
        for(cont=0;cont<2;cont++){
            numeros7[cont] = numeros[cont] + numeros6[cont];
        }
        
        for(cont=0;cont<2;cont++){
            JOptionPane.showMessageDialog(null, ":"+numeros7[cont]);
        }
         
        
    }
}
