/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class App {
    
    public static void main(String[] args){
        
        CarroCorrida carro = new CarroCorrida();
        
        carro.setNumeroIdentificacao(19232);
        JOptionPane.showMessageDialog(null,"Sua Identificação é "+carro.getNumeroIdenticacao());

        carro.setNumeroIdentificacao(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe Valor")));
        JOptionPane.showMessageDialog(null,"Sua Identificação é "+carro.getNumeroIdenticacao());

        carro.setVelocidadeAtual(180);
        JOptionPane.showMessageDialog(null,"Sua Velocidade Atual é de: "+carro.getVelocidadeAtual());
        
        carro.setVelocidadeAtual(Float.parseFloat(JOptionPane.showInputDialog(null,"Informe Velocidade Atual")));
        JOptionPane.showMessageDialog(null,"Sua Velocidade Atual é de: "+carro.getVelocidadeAtual());
        
        carro.setVelocidadeMaxima(200);
        JOptionPane.showMessageDialog(null,"A Velocidade Máxima é de "+carro.getVelocidadeMaxima());
    
        carro.setVelocidadeMaxima(Double.parseDouble(JOptionPane.showInputDialog("Insira velocidade Máxima")));
        JOptionPane.showMessageDialog(null,"A Velocidade Máxima é de "+carro.getVelocidadeMaxima());
    }
    
}
