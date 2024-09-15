package Aula09;

public class Main {
    public static void main(String[] args){
        ListaDupla listaDupla = new ListaDupla();

        for (int i = 0; i < 99; i++) {
            listaDupla.insereInicio(i );
        }
        listaDupla.mostraListaUlt();
        listaDupla.mostraListaPrim();

    }
}
