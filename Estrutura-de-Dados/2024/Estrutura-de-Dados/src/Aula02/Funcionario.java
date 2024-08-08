/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author LucasSilvaGarcia
 */
public class Funcionario {
    private String nome;
    private String email;
    
    public Funcionario(){
        this.nome = "";
        this.email = "";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    public String criarEmail(){
        return this.email = this.nome.charAt(0) + this.nome + "@estruturadados.com.br";
    }
    
    
}
