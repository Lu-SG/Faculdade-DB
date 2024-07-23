/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

/**
 *
 * @author LucasSilvaGarcia
 */
import PDV.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*

To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor. */
 /*

@author lianderson.brum */
public class insert {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) { // TODO code application logic here

        try {

            String driverName = "com.mysql.jdbc.Driver";
            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {

            }

// Configurando a nossa conexão com um banco de dados//
            String serverName = "193.123.108.138";    //caminho do servidor do BD

            String mydatabase = "prob2022_2";        //nome do seu banco de dados

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useUnicode=true&characterEncoding=UTF8";

            String username = "prob2022_2";        //nome de um usuário de seu BD      

            String password = "prob2022_2";      //sua senha de acesso

            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();

//ResultSet rs = stmt.executeQuery( "SELECT nome FROM cliente WHERE color = 'blue'" );
            String nome = "Lianderson ";

            stmt.execute("insert into  lucasgarcia_pessoas(Nome,Cpf) values('lili for all','"+JOptionPane.showInputDialog("Insira Nome")+"')");
            conn.close();
            System.out.println("Salvo com Sucesso");
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());

        } // TODO add your handling code here: }//GEN-LAST:event_jButton1ActionPerformed

    }
}
