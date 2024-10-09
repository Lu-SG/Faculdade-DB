package Aula11;

public class ABB {
    private Nodo raiz;

    public ABB(){
        this.raiz = null;
    }

    public Nodo getRaiz(){
        return this.raiz;
    }

    public boolean isEmpty(){
        if(this.raiz == null){
            return true;
        } else {
            return false;
        }
    }

    public Nodo busca (int dado){
        if(!this.isEmpty()){
            Nodo nodoAux = this.raiz;
            while(nodoAux.dado!=dado){
                if(dado< nodoAux.dado){
                    nodoAux = nodoAux.esq;
                } else {
                    nodoAux = nodoAux.dir;
                }
                if(nodoAux == null) {
                    return null;
                }
            }
            return nodoAux;
        }
        return null;
    }

    public void insere(int dado){
        Nodo novoNodo = new Nodo(dado);
        if(this.isEmpty()){
            this.raiz = novoNodo;
        } else {
            Nodo nodoAux = this.raiz;
            Nodo nodoPai;
            boolean achou = false;
            while(!achou){
                nodoPai =  nodoAux;
                if(dado< nodoAux.dado) {
                    nodoAux = nodoAux.esq;
                    if(nodoAux == null){
                        nodoPai.esq = novoNodo;
                        achou = true;
                    }
                } else {
                    nodoAux = nodoAux.dir;
                    if(nodoAux==null){
                        nodoPai.dir=novoNodo;
                        achou = true;
                    }
                }
            }
        }

    }

    public boolean delete (int elemento)
    {
        Nodo nodoAtual = raiz;
        Nodo nodoAnterior = raiz;

        boolean filhoEsquerda = true;

        while (nodoAtual.dado != elemento)
        {
            nodoAnterior = nodoAtual;

            if (elemento < nodoAtual.dado)
            {
                filhoEsquerda = true;
                nodoAtual = nodoAtual.esq;
            }
            else
            {
                nodoAtual = nodoAtual.dir;
                filhoEsquerda = false;
            }


            if (nodoAtual == null)
                return false;
        }


        // encontrou o nodo

        // caso 1: n�o tem filhos
        //
        if ((nodoAtual.esq == null) && (nodoAtual.dir == null))
        {
            if (nodoAtual == raiz)
                raiz = null;
            else
            {
                if (filhoEsquerda)
                    nodoAnterior.esq = null;
                else
                    nodoAnterior.dir = null;
            }
        }
        // caso 2: tem um �nico filho
        else
        if (nodoAtual.dir == null)
        {
            if (nodoAtual == raiz)
                raiz = nodoAtual.esq;
            else
            if (filhoEsquerda)
                nodoAnterior.esq = nodoAtual.esq;
            else
                nodoAnterior.dir = nodoAtual.esq;

        }
        else
        if (nodoAtual.esq == null)
        {
            if (nodoAtual == raiz)
                raiz = nodoAtual.dir;
            else
            if (filhoEsquerda)
                nodoAnterior.esq = nodoAtual.dir;
            else
                nodoAnterior.dir = nodoAtual.dir;
        }
        // caso3: tem 2 filhos
        else
        {
            Nodo sucessor = getSucessor(nodoAtual);

            if (nodoAtual == raiz)
            {
                raiz = sucessor;
            }
            else
            if (filhoEsquerda)
            {
                nodoAnterior.esq = sucessor;
            }
            else
            {
                nodoAnterior.dir = sucessor;
            }

            sucessor.esq = nodoAtual.esq;

        }
        return true;

    }

    private Nodo getSucessor(Nodo nodoExcluir)
    {
        Nodo paiSucessor = nodoExcluir;
        Nodo sucessor    = nodoExcluir;
        Nodo nodoAtual   = nodoExcluir.dir;

        while (nodoAtual != null)
        {
            paiSucessor = sucessor;
            sucessor    = nodoAtual;
            nodoAtual   = nodoAtual.esq;
        }

        if (sucessor != nodoExcluir.dir)
        {
            paiSucessor.esq = sucessor.dir;
            sucessor.dir    = nodoExcluir.dir;
        }

        return sucessor;
    }

    public void emOrdem(Nodo nodoAux){
        if(nodoAux != null){
            emOrdem(nodoAux.esq);
            System.out.println(nodoAux.dado);
            emOrdem(nodoAux.dir);
        }
    }

    public void preOrdem(Nodo nodoAux){
        if(nodoAux != null){
            System.out.println(nodoAux.dado);
            preOrdem(nodoAux.esq);
            preOrdem(nodoAux.dir);
        }
    }

    public void posOrdem(Nodo nodoAux){
        if(nodoAux != null){
            posOrdem(nodoAux.esq);
            posOrdem(nodoAux.dir);
            System.out.println(nodoAux.dado);
        }
    }

}
