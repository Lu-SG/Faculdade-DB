/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Tratamento {

    public static void main(String[] args) {
        try {
            String[] nome = new String[5];

            int d = 0;
            int a = 0;

            a = Integer.parseInt(JOptionPane.showInputDialog("Informe número"));
            d = Integer.parseInt(JOptionPane.showInputDialog("Informe número"));
            int total = a / d;

            nome[5] = "lili";

            System.out.println("Dentro do bloco da exceção");
        } catch (ArithmeticException e) {
            System.out.println("Errou a aritimetica");
            System.out.println(e.fillInStackTrace());
        } catch (NumberFormatException e) {
            System.out.println("enfia um numero, gênio");
            System.out.println(e.fillInStackTrace());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Indevida");

        } catch (Exception e) {
            System.out.println("Erro generico");
            System.out.println(e.fillInStackTrace());
            System.out.println(e.fillInStackTrace());

        } finally{
            System.out.println("FINALMENTE!");
        }

    }
}
