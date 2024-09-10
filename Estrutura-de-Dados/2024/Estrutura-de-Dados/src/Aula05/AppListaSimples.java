package Aula05;

public class AppListaSimples {
    public static void main(String[] args){
        ListaSimples listaSimples = new ListaSimples();
        listaSimples.insereInicio(1);
        listaSimples.insereInicio(2);
        listaSimples.insereInicio(3);
        listaSimples.insereInicio(4);
        listaSimples.insereInicio(5);

        listaSimples.MostraLista();
        listaSimples.removeInicio().mostraNodo();
        listaSimples.removeInicio().mostraNodo();


    }
}
