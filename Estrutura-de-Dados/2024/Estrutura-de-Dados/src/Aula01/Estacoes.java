package Aula01;

public class Estacoes {
    int mes;

    public Estacoes(int mes){
        this.mes = mes;
    }

    public String defineEstacao() {
        if (mes <= 3) {
            return "Verão";
        } else if (mes > 3 && mes <= 6) {
            return "Outono";
        } else if (mes > 6 && mes <= 9) {
            return "Inverno";
        } else if (mes > 9 && mes <= 12) {
            return "Primavera";
        } else return "";
    }
}
