package Aula01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!"+"\n");


        Triangulo tr1 = new Triangulo(10.0,10.0);
        double area = tr1.calculaArea();
        System.out.printf("Área do triângulo: %.2f\n", area);
    }
}