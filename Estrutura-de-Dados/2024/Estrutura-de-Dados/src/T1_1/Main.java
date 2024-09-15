package T1_1;
import java.util.Scanner;

/* FACULDADE DOM BOSCO DE PORTO ALEGRE
 * SI & ADS – Estrutura de Dados – Primeiro T1
 *
 * Objetivo do Programa/Algoritmo: Resolução Problema Adega / T1
 * Componentes do grupo: Lucas Garcia
 * Data da entrega do arquivo fonte: 03/09/2024
 */
public class Main {
    public static void main(String[] args){
        Pilha adega = new Pilha(20);
        Pilha adegaAux = new Pilha(20);

        Scanner scanner = new Scanner(System.in);

        int controle = 0;
        do {
            System.out.println("Bem vindo a sua adega, senhor!, por favor, escolha a operação desejada:"
                    +"\n"+"1 - Inserir vinho"
                    +"\n"+"2 - Remover vinho"
                    +"\n"+"3 - Mostrar 5 vinhos mais antigos"
                    +"\n"+"4 - Sair Adega "
            );
            controle = scanner.nextInt();
            switch (controle) {
                case 1:
                    System.out.println("Favor, Inserir nome do vinho que deseja inserir:");
                    adega.push(scanner.next());
                    break;
                case 2:
                    System.out.println("Claro!, aqui seu vinho, senhor: "+adega.pop());
                    break;

                case 3:

                    while (!adega.isEmpty()){
                        adegaAux.push(adega.pop());
                    }

                    while (!adegaAux.isEmpty()){
                        String vinho = adegaAux.pop();
                        int i = 0;
                        if(i < 5){
                            System.out.println(vinho);
                        }
                            adega.push(vinho);
                        i++;
                    }
                    controle = 4;
            }

        } while (controle != 4);
        System.out.println("Obrigado por utilizar nossa adega, senhor!, tenha uma boa tarde :)");
    }
}
