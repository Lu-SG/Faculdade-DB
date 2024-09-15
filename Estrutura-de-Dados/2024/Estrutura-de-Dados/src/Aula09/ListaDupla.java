package Aula09;

public class ListaDupla {
    public Nodo prim;
    public Nodo ult;

    public ListaDupla(){
        this.prim = null;
        this.ult = null;
    }
    
    public boolean isEmpty(){
        return this.prim == null;
    }

    public void mostraListaPrim(){
        Nodo nodoAux  = this.prim;
        while(nodoAux!=null)
        {
            nodoAux.mostraNodo();
            nodoAux=nodoAux.next;
        }

    }

    public void mostraListaUlt(){
        Nodo nodoAux  = this.ult;
        while(nodoAux!=null)
        {
            nodoAux.mostraNodo();
            nodoAux = nodoAux.prev;
        }
    }

    public void insereInicio(int dado){
        Nodo nodoAux = new Nodo(dado);
        if(!this.isEmpty()){
            nodoAux.next = prim;
            this.prim.prev = nodoAux;
        } else {
            this.ult = nodoAux;
        }

        this.prim = nodoAux;
    }

    public void insereFim(int dado){
        Nodo nodoAux = new Nodo(dado);
        if(!this.isEmpty()){
            nodoAux.prev = ult;
            this.ult.next = nodoAux;
        } else {
            this.prim = nodoAux;
        }

        this.ult = nodoAux;
    }



}

;
