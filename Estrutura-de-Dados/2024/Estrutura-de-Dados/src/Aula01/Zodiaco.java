package Aula01;

public class Zodiaco {
    int num;

    public Zodiaco(int num){
        this.num = num;
    }

    public void imprimeSigno(){
        switch (num){
            case 1:
                System.out.printf("Você é do seguinte signo do zodíaco: Aquário");
                break;
            case 2:
                System.out.printf("Você é do seguinte signo do zodíaco: Peixes");
                break;
            case 3:
                System.out.printf("Você é do seguinte signo do zodíaco: Áries");
                break;
            case 4:
                System.out.printf("Você é do seguinte signo do zodíaco: Touro");
                break;
            case 5:
                System.out.printf("Você é do seguinte signo do zodíaco: Gêmeos");
                break;
            case 6:
                System.out.printf("Você é do seguinte signo do zodíaco: Câncer");
                break;
            case 7:
                System.out.printf("Você é do seguinte signo do zodíaco: Leão");
                break;
            case 8:
                System.out.printf("Você é do seguinte signo do zodíaco: Virgem");
                break;
            case 9:
                System.out.printf("Você é do seguinte signo do zodíaco: Libra");
                break;
            case 10:
                System.out.printf("Você é do seguinte signo do zodíaco: Escorpião");
                break;
            case 11:
                System.out.printf("Você é do seguinte signo do zodíaco: Sagitário");
                break;
            case 12:
                System.out.printf("Você é do seguinte signo do zodíaco: Capricórnio");
                break;
        }

    }


}
