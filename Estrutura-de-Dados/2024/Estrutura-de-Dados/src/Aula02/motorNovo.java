package Aula02;

public class motorNovo extends motor{
    public motorNovo(String fabricante, int voltagem, int velocidade) {
        super(fabricante, voltagem, velocidade);
    }

    public void acelera(){
        if(getRPM() < 5000 && verificaVelocidade() >= 0){
            setVelocidade(verificaVelocidade() + 5);
        }
    }

    public void freia(){
        if(getRPM() < 5000 && verificaVelocidade() > 0){
            setVelocidade(verificaVelocidade() - 5);
        }
    }

}
