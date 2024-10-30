package Aula14;

public class Main {
    public static void main(String args[]) {
        Grafo grafo = new Grafo(9);
        grafo.addNo('A');
        grafo.addNo('B');
        grafo.addNo('C');
        grafo.addNo('D');
        grafo.addNo('E');
        grafo.addNo('F');
        grafo.addNo('G');
        grafo.addNo('H');
        grafo.addNo('I');

        grafo.addAresta(0,1);
        grafo.addAresta(0,2);
        grafo.addAresta(0,3);
        grafo.addAresta(0,4);
        grafo.addAresta(1,5);
        grafo.addAresta(3,6);
        grafo.addAresta(5,7);
        grafo.addAresta(6,8);

        grafo.largura();
        grafo.profundidade();






    }
}