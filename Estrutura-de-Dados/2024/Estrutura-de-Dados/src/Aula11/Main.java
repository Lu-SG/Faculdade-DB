package Aula11;

public class Main {
    public static void main(String[] args){
        ABB abb = new ABB();
        abb.insere(60);
        abb.insere(50);
        abb.insere(40);
        abb.insere(30);
        abb.insere(48);
        abb.insere(55);
        abb.insere(52);
        abb.insere(58);
        abb.insere(80);
        abb.insere(70);
        abb.insere(90);
        abb.insere(95);

        System.out.println("Em Ordem:"+"\n");
        abb.emOrdem(abb.getRaiz());
        System.out.println("\n"+"Em Pré:"+"\n");
        abb.preOrdem(abb.getRaiz());
        System.out.println("\n"+"Em Pós:"+"\n");
        abb.posOrdem(abb.getRaiz());

        System.out.println("\n"+"Busca"+"\n");
        abb.busca(50).mostraNodo();

    }
}
