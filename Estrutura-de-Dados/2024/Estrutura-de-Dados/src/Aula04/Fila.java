/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Fila {
    private int memo[];
    private int tam;
    private int inicio;
    private int fim;

    public void setMemo(int[] memo) {
        this.memo = memo;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }
    
    public Fila(int tam){
        this.tam = tam;
        this.memo = new int[this.tam];
        this.inicio = 0;
        this.fim = 0;
        
    }
    
    public void insere(int elemento){
        if(!this.isFull()){
            this.memo[this.fim] = elemento;
            this.fim++;
        }
        else{
            System.out.println("OverFlow!");
        }
        
    }
    
    public int remove(){
        int retorno = -1; 
        
        if(!this.isEmpty()){
            retorno = this.memo[this.inicio];
            this.inicio++;    
        } else {
            System.out.println("UnderFlow");
        }
        return retorno;
    }

    public int[] getMemo() {
        return memo;
    }

    public int getTam() {
        return tam;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }
    
    public boolean isFull(){
        if(this.fim == this.tam)
            return true;
        else
            return false;
    }
     public boolean isEmpty(){
         if(this.inicio == this.fim){
             return true;
         }
         else{
             return false;
         }
               
     }
    
         
}
