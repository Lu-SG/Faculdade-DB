package T2_1;

import Aula09.Nodo;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        /* FACULDADE DOM BOSCO DE PORTO ALEGRE
         * SisInfo & ADS – Estrutura de Dados – Primeiro T2
         *
         * Objetivo do Programa: Inserção elementos lista principal, separar PAR IMPAR listas auxiliares
         * Componentes do grupo: Lucas Garcia
         * Data da entrega do arquivo fonte: 10/08/2024
         */
        ListaDupla listaPrincipal = new ListaDupla();
        ListaDupla listaAux = new ListaDupla();
        ListaDupla LDPar = new ListaDupla();
        ListaDupla LDImpar = new ListaDupla();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao programa!"+"\n");
        int i = 0;
        do {
            System.out.println("Favor, escolha operação desejada:"+"\n"
                    + "1 - Inserir Lista" + "\n"
                    + "2 - Sair" + "\n"
            );
            i = scanner.nextInt();
            if (i == 1) {
                System.out.println("\n"+"Favor, digitar número que deseja inserir na lista:");
                int aux = scanner.nextInt();
                if(aux < 0){
                    listaPrincipal.insereInicio(aux);
                } else {
                    listaPrincipal.insereFim(aux);
                }
            }
        } while (i != 2);

        do {
            Nodo aux2 = listaPrincipal.removeInicio();
            if(aux2.dado % 2 == 0){
                LDPar.insereInicio(aux2.dado);
            } else {
                LDImpar.insereInicio(aux2.dado);
            }
            listaAux.insereInicio(aux2.dado);

        } while (!listaPrincipal.isEmpty());

        do{
            listaPrincipal.insereInicio(listaAux.removeInicio().dado);
        } while(!listaAux.isEmpty());

        System.out.println("Listas:"+"\n");

        System.out.println("Principal:"+"\n");
        listaPrincipal.mostraListaPrim();

        System.out.println("Pares:"+"\n");
        LDPar.mostraListaPrim();

        System.out.println("Impares:"+"\n");
        LDImpar.mostraListaPrim();

        System.out.println("\n"+"Agradecemos sua prefencia! até logo :)");

    }
}
