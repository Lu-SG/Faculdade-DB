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

    public Nodo removeInicio(){
        Nodo nodoAux = this.prim;
        if(this.prim.next == null){
            this.ult = null;
        } else {
            this.prim.next.prev = null;
        }
        this.prim = this.prim.next;
        return nodoAux;

    }

    public Nodo removeFim(){
        Nodo nodoAux = this.ult;
        if(this.ult.prev == null){
            this.prim = null;
        } else {
            this.ult.prev.next = null;
        }
        this.prim = this.ult.prev;
        return nodoAux;
    }
    public void insere (int elemento, int pos) {

        if ( (pos == 1) || (prim == null) )
            insereInicio(elemento);

        else {

            int cont = 1;
            Nodo nodoAux = prim;

            while ( nodoAux.next != null ) {

                cont++;
                nodoAux = nodoAux.next;
            }

            if ( pos > cont )
                insereFim(elemento);

            else {

                cont = 1;
                nodoAux = prim;

                while ( cont < pos ) {

                    cont++;
                    nodoAux = nodoAux.next;
                }

                Nodo novoNodo = new Nodo(elemento);
                novoNodo.prev = nodoAux.prev;
                novoNodo.next = nodoAux;

                nodoAux.prev.next = novoNodo;
                nodoAux.prev = novoNodo;
            }
        }
    }

    public Nodo remove (int pos) {

        if ( (pos == 1) || (prim == null) ) {

            return removeInicio();
        }

        else {

            int cont = 1;
            Nodo nodoAux = prim;

            while ( nodoAux.next != null ) {

                cont++;
                nodoAux = nodoAux.next;
            }

            if ( pos >= cont ) {

                return removeFim();
            }

            else {

                nodoAux = prim;
                cont = 1;

                while ( cont < pos ) {

                    cont++;
                    nodoAux = nodoAux.next;
                }

                nodoAux.prev.next = nodoAux.next;
                nodoAux.next.prev = nodoAux.prev;

                return nodoAux;
            }
        }
    }


}

;
