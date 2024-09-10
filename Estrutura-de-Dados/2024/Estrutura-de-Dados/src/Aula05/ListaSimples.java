package Aula05;

public class ListaSimples
{
    public Nodo prim;

    public ListaSimples()
    {
        this.prim = null;
    }

    public boolean isEmpty()
    {
        if (this.prim == null)
            return true;
        else
            return false;
    }

    public void insereInicio(int elemento)
    {
        Nodo novoNodo = new Nodo(elemento);
        novoNodo.next = prim;
        prim          = novoNodo;
    }

    public Nodo removeInicio()
    {
        Nodo nodoAux = prim;
        if (!this.isEmpty())
        {
            prim = nodoAux.next;
        }
        return nodoAux;
    }

    public void insereFim(int elemento)
    {

        Nodo nodoUltimo = this.prim;

        if (this.prim != null)
        {
            while (nodoUltimo.next != null)
            {
                nodoUltimo = nodoUltimo.next;
            }

        }

        Nodo novoNodo = new Nodo (elemento);

        if (this.prim == null)
            this.prim = novoNodo;
        else
            nodoUltimo.next  = novoNodo;

    }

    public Nodo removeFim ()
    {
        Nodo nodoAux    = this.prim;
        if (!this.isEmpty())
        {
            Nodo nodoUltimo = this.prim;


            while (nodoUltimo.next != null)
            {
                nodoAux = nodoUltimo;
                nodoUltimo = nodoUltimo.next;
            }

            if (nodoUltimo != nodoAux)
                nodoAux.next = null;
            else
                this.prim = null;
        }

        return nodoUltimo;
    }

    public void mostraLista()
    {
        System.out.println ("mostra do primeiro ao ultimo");

        Nodo nodoAtual = prim;

        while (nodoAtual != null)
        {
            nodoAtual.mostraNodo();
            nodoAtual = nodoAtual.next;
        }
    }

    public void insere (int elemento, int pos)
    {
        if ((pos == 1) || (this.prim == null))
            insereInicio (elemento);
        else
        {
            int cont = 1;
            Nodo nodoAux = this. prim;
            while (nodoAux.next != null)
            {
                cont++;
                nodoAux = nodoAux.next;
            }

            if (pos > cont)
                insereFim(elemento);
            else
            {
                cont = 1;
                nodoAux = this.prim;
                while (cont < (pos - 1))
                {
                    cont ++;
                    nodoAux = nodoAux.next;
                }

                Nodo novoNodo = new Nodo(elemento);

                novoNodo.next = nodoAux.next;

                nodoAux.next = novoNodo;


            }
        }
    }


}