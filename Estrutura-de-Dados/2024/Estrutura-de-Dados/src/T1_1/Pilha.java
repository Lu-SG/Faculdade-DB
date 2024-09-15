package T1_1;

public class Pilha {
    private int tam;
    private int topo;
    private String memo[];

    public Pilha(int tam){
        this.tam = tam;
        this.memo = new String[tam];
        this.topo = -1;
    }

    public void push(String elemento) {
        if (!isFull()) {
            this.topo++;
            this.memo[this.topo] = elemento;
        } else {
            System.out.println("Overflow!");
        }
    }

    public String pop(){
        String retorno = "";

        if(!this.isEmpty()){
            retorno = this.memo[this.topo];
            this.topo--;
        } else {
            System.out.println("Underflow!");
        }
        return retorno;
    }

    public String top(){
        String retorno = "";
        if(!this.isEmpty()){
            retorno = this.memo[this.topo];
        } else {
            System.out.println("Empty!");
        }
        return retorno;
    }

    public boolean isFull(){
        if (this.topo == (this.tam - 1)){
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

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }


}
