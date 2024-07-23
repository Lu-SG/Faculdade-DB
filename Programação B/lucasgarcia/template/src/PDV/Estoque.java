/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDV;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Estoque {

    public Estoque() {
    }

    private String Nome;
    private int Quantidade;

    public void Cadastrar(String Nome, Integer Saldo) {
        setNome(Nome);
        setQuantidade(Saldo);
    }

    public void Ler() {
        getNome();
        getQuantidade();
    }

    public void Atualizar(Float Saldo, Float Receita, Float Despesas) {

    }

    public void Deletar(Float Saldo, Float Receita, Float Despesas) {

    }
    
    
    
    public String getNome() {
        return Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

}
