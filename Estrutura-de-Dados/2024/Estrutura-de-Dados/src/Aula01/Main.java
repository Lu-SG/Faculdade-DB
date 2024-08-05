package Aula01;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello and welcome!"+"\n");


        Triangulo tr1 = new Triangulo(10.0,10.0);
        double area = tr1.calculaArea();
        System.out.printf("Área do triângulo: %.2f\n\n", area);

        Circulo cr1 = new Circulo(10);
        double areacir= cr1.Area();
        System.out.printf("Área do circulo: %.2f\n\n", areacir);

        Principal cr2 = new Principal(12);
        cr2.Area();
        System.out.println("\n");
        System.out.printf("Insira Número 1:\n");
        Double num1 = scanner.nextDouble();

        System.out.printf("Insira Número 2:\n");
        Double num2 = scanner.nextDouble();

        Soma soma = new Soma(num1,num2);

        System.out.printf("A soma dos números é: %.2f\n\n", soma.SomaNumeros());

        System.out.printf(
                " 1 - signo do zodíaco:  (21/jan à 19/fev)\n" +
                " 2 - signo do zodíaco:  (20/fev à 20/mar)\n" +
                " 3 - signo do zodíaco:  (21/mar à 20/abr)\n" +
                " 4 - signo do zodíaco:  (21/abr à 20/mai)\n" +
                " 5 - signo do zodíaco:  (21/mai à 20/jun)\n" +
                " 6 - signo do zodíaco:  (21/jun à 21/jul)\n" +
                " 7 - signo do zodíaco:  (22/jul à 22/ago)\n" +
                " 8 - signo do zodíaco:  (23/ago à 22/set)\n" +
                " 9 - signo do zodíaco:  (23/set à 22/out)\n" +
                " 10 - signo do zodíaco: (23/out à 21/nov)\n" +
                " 11 - signo do zodíaco: (22/nov à 21/dez)\n" +
                " 12 - signo do zodíaco: (22/dez à 20/jan)\n"
                );

        System.out.printf("Insira Número Correspondente\n");
        int signo = scanner.nextInt();

        Zodiaco zodiaco = new Zodiaco(signo);
        zodiaco.imprimeSigno();

        System.out.printf("\nInsira Número Correspondente ao Mês:\n");
        int mes = scanner.nextInt();

        Estacoes estacoes = new Estacoes(mes);
        System.out.println("A estação do ano correspondente ao mês "+ mes +" é "+estacoes.defineEstacao());

    }
}