package T1_2;

public class Nodo {
    public int dado;
    public Nodo next;

    public Nodo(int dado){
        this.dado = dado;
        this.next = null;
    }

    public void mostraNodo(){
        System.out.println("Dado:"+this.dado+"Next"+this.next);
    }
}
