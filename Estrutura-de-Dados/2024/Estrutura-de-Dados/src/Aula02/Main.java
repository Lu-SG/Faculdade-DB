/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;
import java.util.Scanner;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Main {
    public static void main(String args[]){
        /*
        Caixa caixa = new Caixa(3,3,3);
        System.out.println(caixa.getAltura());
        caixa.setAltura(0);
        System.out.println(caixa.CalculaVolume());
        Caixa caixa2 = caixa;
        caixa2.setLargura(1);
        */
        /*Caixa2 caixa = new Caixa2(3,3,3);
        System.out.println(caixa.altura);;
        */
        
        //EX01
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira Base:\n");
        double Base = scanner.nextDouble();
        
        System.out.println("Insira Altura:\n");
        double Altura = scanner.nextDouble();
        
        Triangulo tr1 = new Triangulo(Base,Altura);
        System.out.println("A Área do Triangulo: \n"+tr1.Area());
        */
        //EX02
        /*
        Funcionario funcionario = new Funcionario();
        System.out.println("Insira Nome Completo:");
        Scanner scanner = new Scanner(System.in);
        funcionario.setNome(scanner.nextLine());
        funcionario.criarEmail();
        System.out.println(funcionario.getEmail());
        */
        //EX03
        /*
        Funcionario funcionario = new Funcionario();
        System.out.println("Insira Nome Completo:");
        Scanner scanner = new Scanner(System.in);
        funcionario.setNome(scanner.nextLine());
        funcionario.criarEmail();
        System.out.println("Nome: \n"+funcionario.getNome()+"\n"+"E-mail: "+funcionario.getEmail());
        */
        //EX04
        /*
        Scanner scanner = new Scanner(System.in);
        calculadoraBasica calculadoraBasica = new calculadoraBasica();

        System.out.println("Insira N1:");
        calculadoraBasica.setNum1(scanner.nextDouble());

        System.out.println("Insira N2:");
        calculadoraBasica.setNum2(scanner.nextDouble());

        System.out.println(
                "Escolha Operação:\n" +
                "1 -- +\n" +
                "2 -- -\n" +
                "3 -- *\n" +
                "4 -- /\n"
        );
        int operacao = scanner.nextInt();

        switch (operacao){
            case(1):
                System.out.println("O Resultado da + é: "+calculadoraBasica.somaNumeros());
                break;
            case(2):
                System.out.println("O Resultado da - é: "+calculadoraBasica.subrNumeros());
                break;
            case(3):
                System.out.println("O Resultado da *  é: "+calculadoraBasica.multNumeros());
                break;
            case(4):
                System.out.println("O Resultado da /  é: "+calculadoraBasica.divNumeros());
                break;
        }
        */
        //EX06
        /*
        motor motor0 = new motor("Ford",12,10);
        motor motor1 = new motor("GM",12,20);
        motor motor2 = new motor("VW",12,30);

        System.out.println(
                "\nMotor 0:" +
                "\nFabricante: " + motor0.getFabricante() +
                "\nVoltagem: " + motor0.getVoltagem() +
                "\nVelocidade: " + motor0.verificaVelocidade()
        );

        System.out.println(
                "\nMotor 1:" +
                        "\nFabricante: " + motor1.getFabricante() +
                        "\nVoltagem: " + motor1.getVoltagem() +
                        "\nVelocidade: " + motor1.verificaVelocidade()
        );

        System.out.println(
                "\nMotor 2:" +
                        "\nFabricante: " + motor2.getFabricante() +
                        "\nVoltagem: " + motor2.getVoltagem() +
                        "\nVelocidade: " + motor2.verificaVelocidade()
        );
         */

        //EX07:
        motorNovo motor0 = new motorNovo("Ford",12,10);
        motorNovo motor1 = new motorNovo("GM",12,20);
        motorNovo motor2 = new motorNovo("VW",12,30);

        motor0.acelera();
        do{
            motor2.freia();
            System.out.println(motor2.verificaVelocidade());
        }while(motor2.verificaVelocidade() != 0);










    }
}
