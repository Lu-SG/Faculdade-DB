package Aula11;

public class Nodo {
    public int dado;
    public Nodo dir;
    public Nodo esq;

    public Nodo(int dado){
        this.dado = dado;
        this.dir = null;
        this.esq = null;
    }

    public void mostraNodo(){
        System.out.println(
                "Prev: "+this.esq +
                " Dado: "+this.dado+
                " Next: "+this.dir
        );
    }
}
