package Aula05;

public class ListaSimples {
    public Nodo prim;

    public ListaSimples(){
        this.prim = null;
    }

    public boolean isEmpty(){
        if(this.prim == null){
            return true;
        } else {
            return false;
        }
    }

    public void insereInicio(int dado){
        Nodo nodoAux = new Nodo(dado);
        nodoAux.next = this.prim;
        this.prim = nodoAux;
    }



}
