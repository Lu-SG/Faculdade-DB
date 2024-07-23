/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_02;

import javax.swing.JOptionPane;

/**
 *
 * @author LucasSilvaGarcia
 */
public class questão_05_prova {
    public static void main(String[] args) {  
        int tabuleiro[][];
        tabuleiro = new int[3][3];
        int l,c,cont = 0,cont2 = 0;
        int resp = 0,resp1 =0;
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
            do{
                Jogada = Integer.parseInt(JOptionPane.showInputDialog("PLAYER 1"+"\n"+"Insira Jogada"+"\n"+"Jogadas válidas:"+"\n"+"1 até 8"));

                if(Jogada == 0 || Jogada == 1 || Jogada == 2 || Jogada == 3 || Jogada == 4 || Jogada == 5 || Jogada == 6 || Jogada == 7 || Jogada == 8){
                    for(l=0;l<tabuleiro.length;l++){
                        for(c=0;c<tabuleiro.length;c++){
                            if(Jogada == tabuleiro[l][c])
                            {
                                tabuleiro[l][c] = 99;// 99 é o flag da posição do 1 player
                                resp = 1;
                                cont2++;
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
                                cont2++;
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
            for(l=0;l<tabuleiro.length;l++){
                    System.out.println(""+tabuleiro[l][0]+"\t"+tabuleiro[l][1]+"\t"+tabuleiro[l][2]); 
                    System.out.println("\n");
            }
            if(cont2==9){
                resp1 = 1;
            }
            
        
        }while(resp1==0);    
    }    
}