package Aula02;

public class motor {
    private int velocidade;
    private int RPM;
    private int voltagem;
    private String fabricante;
    private String status;

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getRPM() {
        return RPM;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public motor(String fabricante, int voltagem, int velocidade){
        this.fabricante = fabricante;
        this.voltagem = voltagem;
        this.velocidade = velocidade;
        this.status = "LIGADO";
    }

    public void ligaMotor(){
        status = "LIGADO";
    }

    public void desligaMotor(){
        status = "DESLIGADO";
    }

    public int verificaVelocidade(){
        return velocidade;
    }


}