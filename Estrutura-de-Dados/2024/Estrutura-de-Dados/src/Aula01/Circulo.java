package Aula01;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Double Area(){
        return 3.14 * (Math.pow(raio,2));
    }

}
