package aula_17;
import javax.swing.JOptionPane;

//* @author LucasSilvaGarcia



public class Aula_17_pgm_01 {

    public static void main(String[] args) {
        int [][]numeros;
        numeros = new int[3][3];
        /*
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;
        
        System.out.println(""+numeros[0][0]+" "+numeros[0][1]);
        System.out.println(""+numeros[1][0]+" "+numeros[1][1]);
        */
        for(int x = 0;x < numeros.length;x++)
        {
            for(int y = 0;y < numeros.length;y++)
            {
                numeros[x][y] = x + y;  
            }   
        }
        
        
        String monta_tela = "";
        for(int x = 0;x < numeros.length;x++)
        {
            for(int y = 0;y < numeros.length;y++)
            {
                //System.out.println(""+numeros[x][y]);
                monta_tela = monta_tela + ""+numeros[x][y];
            }
            System.out.println("\n");
        }
        System.out.println(monta_tela);
     
    }
    
}
