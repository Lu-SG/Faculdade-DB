package javaapplication4;
import javax.swing.JOptionPane;

public class JavaApplication4 {

    
    public static void main(String[] args) {
        String s_velocidade = JOptionPane.showInputDialog(null,"Informe a velocidade do veiculo"); 
        float velocidade = Integer.parseInt(s_velocidade);
        
        if (velocidade >= 80 && velocidade <= 119){
        JOptionPane.showMessageDialog(null,"Acima da velocidade");
        }
        if (velocidade >= 120 && velocidade <= 199){
        JOptionPane.showMessageDialog(null,"Acima da velocidade, multa de 5.000 reais");    
        }
        if (velocidade > 200){
        JOptionPane.showMessageDialog(null,"Acima da velocidade, multa de 50.000 reais e seu carro será aprendido");    
        }
        
      
}
}