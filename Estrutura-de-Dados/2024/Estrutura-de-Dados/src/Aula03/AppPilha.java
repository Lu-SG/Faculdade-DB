package Aula03;
import java.util.Scanner;
public class AppPilha {
    public static void main (String args[]){
        /*
        System.out.println("Insira Tamanho da Pilha");
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();

        Pilha pilha = new Pilha(5);

        for(int i = 0; i < tamanho; i++){
            System.out.println("Insira Número:");
            pilha.push(scanner.nextInt());
        }

        System.out.println(pilha.top());
        for(int i = 0; i < tamanho; i++){
            System.out.println(pilha.pop());
        }
        */

        //EX01
        /*
        1. Dada uma pilha alocada sobre um vetor [1..5], faça um algoritmo que leia 15 números e
        proceda, para cada um deles, como segue:
        - se o número for par, insira-o na pilha; se houver overflow, retire um elemento da pilha e
        insira o número lido;
        - se o número lido for ímpar, retire um número da pilha; se ocorrer underflow, imprima uma
        mensagem.
                Ao final, esvazie a pilha imprimindo os elementos.
        */

        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(2);
        for(int i = 0;i < pilha.getTam(); i++) {
            System.out.println("Insira número:");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                if(!pilha.isFull()){
                    pilha.push(num);
                }
            } else {
                pilha.pop();
            }
        }
        for(int i = 0;i < pilha.getTam();i++){
            System.out.println(i);
            System.out.println(pilha.pop());
        }

    }


}
