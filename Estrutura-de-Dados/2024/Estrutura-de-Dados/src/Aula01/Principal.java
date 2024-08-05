package Aula01;

public class Principal {
    double raio;

    public Principal(double raio) {
        this.raio = raio;
    }

    public void Area(){
        double Area;
        Area = 3.14 * (Math.pow(raio,2));
        System.out.printf("Área do circulo Principal: %.2f\n", Area);
        System.out.printf("Raio do circulo Principal: %.2f\n", raio);


    }

}
