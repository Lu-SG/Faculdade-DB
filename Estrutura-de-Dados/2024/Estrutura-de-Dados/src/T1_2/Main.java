package T1_2;
import java.util.Scanner;

/* FACULDADE DOM BOSCO DE PORTO ALEGRE
 * SisInfo & ADS – Estrutura de Dados – Segundo T1
 *
 * Objetivo do Programa: Solucionar Problema T1_2
 * Lista Inteiros Crescente --> Fila Pares Decrecentes e Fila Impares Decrescente
 * Componentes do grupo: Lucas Garcia
 * Data da entrega do arquivo fonte: 15/09/2024
 */
public class Main {
    public static void main(String[] args){
        ListaSimples lista = new ListaSimples();
        //colocar dinamico lendo tamanho da lista?
        FilaCircular filaCircular = new FilaCircular(10);
        Pilha pilha = new Pilha(10);
        Pilha pilha2 = new Pilha(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao programa do T1_2!"+"\n");

        int escolha = 0;
        while (escolha != 5){
                System.out.println("Favor, digitar operação desejada:"+"\n"+
                        "1 - Inserir elemento na Lista Simples"+"\n"+
                        "2 - Mostrar Pilha"+"\n"+
                        "3 - Mostrar Fila"+"\n"+
                        "4 - Calcular Pilha e Fila"+"\n"+
                        "5 - Sair"+"\n"
                );
                escolha = scanner.nextInt();

                switch (escolha){
                    case(1):
                        System.out.println("Favor, digitar operação desejada:"+"\n"+
                                "1 - Inserir elemento no Início"+"\n"+
                                "2 - Inserir elemento no Fim"+"\n"+
                                "3 - Inserir elemento na 'x' posição desejada"+"\n"
                        );

                        int escolha_insercao = scanner.nextInt();
                        int elemento = 0;

                        switch (escolha_insercao){
                            case(1):
                                System.out.println("Favor, digitar elemento que deseja inserir:"+"\n");
                                elemento = scanner.nextInt();
                                lista.insereInicio(elemento);
                                break;

                            case(2):
                                System.out.println("Favor, digitar elemento que deseja inserir:"+"\n");
                                elemento = scanner.nextInt();
                                lista.insereFim(elemento);

                                break;

                            case(3):
                                System.out.println("Favor, digitar elemento que deseja inserir:"+"\n");
                                elemento = scanner.nextInt();
                                System.out.println("Favor, digitar posição desejada:"+"\n");
                                int posicao = scanner.nextInt();
                                lista.insere(elemento,posicao);
                                break;
                        }
                        break;

                    case(2):
                        while (!pilha.isEmpty()){
                            System.out.println(pilha.pop());
                        }
                    break;

                    case(3):
                        while (!filaCircular.isEmpty()){
                            System.out.println(filaCircular.remove());
                        }
                        break;


                    case(4):
                        Nodo nodoAux = lista.prim;

                        while (nodoAux != null) {
                            if (nodoAux.dado % 2 != 0 && nodoAux.dado > 0) {
                                pilha.push(nodoAux.dado); // Ímpar positivo vai para a pilha
                            } else {
                                pilha2.push(nodoAux.dado); // Par ou negativo vai para pilha2
                            }
                            nodoAux = nodoAux.next; // Avança para o próximo nó
                        }

                        while (!pilha2.isEmpty()) {
                            filaCircular.insere(pilha2.pop()); // Transfere elementos da pilha2 para a fila circular
                        }

                        break;
                }
        }

        System.out.println("Obrigado por utilizar esse programa, até a próxima ;)"+"\n");

    }
}
