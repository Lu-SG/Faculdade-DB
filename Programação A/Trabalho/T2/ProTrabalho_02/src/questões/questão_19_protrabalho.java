/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas
 * 19) Implemente um jogo-da-velha, com as seguintes características:
 * a. O tabuleiro é formado por um array bidimensional, onde as posições são numeradas conforme abaixo: 0 1 2 3 4 5 6 7 8
 * b. Para jogar, os jogadores devem digitar o número correspondente ao quadro que desejam jogar. Caso o quadro já esteja ocupado, ou o valor digitado pelo usuário não seja um número de 0 a 8, o programa deve acusar a jogada inválida e pedir que o jogador digite novamente.
 * c. O programa deve considerar dois jogadores (que podem ser nomeados jogadorX e jogadorO), e utilizar dois símbolos distintos para representar a cada um deles.
 * d. O programa deve perguntar alternadamente a próxima jogada, ou seja, primeiro pergunta a jogada do jogadorX, depois do jogadorO e assim sucessivamente.
 * e. A cada nova jogada o programa deve mostrar o tabuleiro com a situação atual do jogo (seja criativo). Por exemplo:
 * Dica: você pode usar os caracteres \t para gerar tabulações tela de impressão, e o \n para gerar linhas em branco entre os tabuleiros.
 * f. Se um dos jogadores ganhar, o sistema deve mostrar uma mensagem de vitória. Se houver empate, o programa deve emitir a respectiva mensagem.
 * 
 */
public class questão_19_protrabalho {
    public static void main(String[] args) {  
        int tabuleiro[][];
        tabuleiro = new int[3][3];
        int l,c,cont = 0;
        int resp = 0;
        int Jogada;
        
        //gera tabuleiro
        for(l=0;l<tabuleiro.length;l++){
            for(c=0;c<tabuleiro.length;c++){
                tabuleiro[l][c] = cont++;
            }
        }
        //Mostra tabuleiro
        for(l=0;l<tabuleiro.length;l++){
            for(c=0;c<tabuleiro.length;c++){
                System.out.println(""+tabuleiro[l][c]); 
            }
        }
        //solicita jogada 1 player
        do{
            Jogada = Integer.parseInt(JOptionPane.showInputDialog("PLAYER 1"+"\n"+"Insira Jogada"+"\n"+"Jogadas válidas:"+"\n"+"1 até 8"));
            
            if(Jogada == 0 || Jogada == 1 || Jogada == 2 || Jogada == 3 || Jogada == 4 || Jogada == 5 || Jogada == 6 || Jogada == 7 || Jogada == 8){
                for(l=0;l<tabuleiro.length;l++){
                    for(c=0;c<tabuleiro.length;c++){
                        if(Jogada == tabuleiro[l][c])
                        {
                            tabuleiro[l][c] = 99;// 99 é o flag da posição do 1 player
                            resp = 1;
                        }
                    }
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "ENTRADA INVÁLIDA");
            }     
        }while(resp==0);
        //solicita jogada 2 player

        do{
            Jogada = Integer.parseInt(JOptionPane.showInputDialog("PLAYER 2"+"\n"+"Insira Jogada"+"\n"+"Jogadas válidas:"+"\n"+"1 até 8"));
            if(Jogada == 0 || Jogada == 1 || Jogada == 2 || Jogada == 3 || Jogada == 4 || Jogada == 5 || Jogada == 6 || Jogada == 7 || Jogada == 8){
                for(l=0;l<tabuleiro.length;l++){
                    for(c=0;c<tabuleiro.length;c++){
                        if(Jogada == tabuleiro[l][c])
                        {
                            tabuleiro[l][c] = 98;// 98 é o flag da posição do 1 player
                            resp = 1;
                        }
                    }
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "ENTRADA INVÁLIDA");
            }    
        }while(resp==0);
        
        for(l=0;l<tabuleiro.length;l++){
            for(c=0;c<tabuleiro.length;c++){
                System.out.println(""+tabuleiro[l][c]); 
            }
        }
        
        
        
    
    
    
    
    }    
}
