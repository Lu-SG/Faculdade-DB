package Aula03;

public class Pilha {
    private int tam;
    private int topo;
    private int memo[];

    public Pilha(int tam){
        this.tam = tam;
        this.memo = new int[tam];
        this.topo = -1;
    }

    public void push(int elemento) {
        if (!isFull()) {
            this.topo++;
            this.memo[this.topo] = elemento;
        } else {
            System.out.println("Overflow!");
        }
    }

    public int pop(){
        int retorno = -1;
        if(!this.isEmpty()){
            retorno = this.memo[this.topo];
            this.topo--;
        } else {
            System.out.println("Underflow!");
        }
        return retorno;
    }

    public boolean isFull(){
        if (this.topo == this.tam - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(this.topo == -1){
            return true;
        } else {
            return false;
        }
    }
    public int top(){
        int retorno = -1;
        if(!this.isEmpty()){
            retorno = this.memo[this.topo];
        } else {
            System.out.println("Underflow!");
        }
        return retorno;
    }
}
