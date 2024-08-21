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
public class FilaCircular {
    private int memo[];
    private int tam;
    private int inicio;
    private int fim;
    private int total;
    
    public FilaCircular(int tam){
        this.total = 0;
        this.tam = tam;
        this.memo = new int[this.tam];
        this.inicio = 0;
        this.fim = 0;
        
    }
    
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

    public void setTotal(int total) {
        this.total = total;
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

    public int getTotal() {
        return total;
    }
    
    public void insere(int elemento){
        if(!this.isFull()){
            this.total++;
            this.memo[this.fim] = elemento;
            if(this.fim == this.tam - 1){
                this.fim = 0;
            } else {
                this.fim++;
            }
        }
        else{
            System.out.println("OverFlow!");
        }
        
    }
    
    public int remove(){
        int retorno = -1; 
        
        if(!this.isEmpty()){
            this.total--;    
            retorno = this.memo[this.inicio];
            
            if(this.inicio == this.tam -1){
                this.inicio = 0;
            } else {
                this.inicio++;        
            }
        } else {
            System.out.println("UnderFlow");
        }
        return retorno;
    }
   
    public boolean isFull(){
        if(this.total == this.tam)
            return true;
        else
            return false;
    }
     public boolean isEmpty(){
         if(this.total == 0){
             return true;
         }
         else{
             return false;
         }
               
     }
    
         
}
