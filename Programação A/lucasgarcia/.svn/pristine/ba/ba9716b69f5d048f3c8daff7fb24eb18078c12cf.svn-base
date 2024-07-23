/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*

To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor. */ /**
 * @author lianderson.brum
 */
public class select {

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
// String nome = "Lianderson ";
            String query = "SELECT * FROM lucasgarcia_pessoas";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(" Nome : " + rs.getString("Nome"));
                System.out.println(" Cpf : " + rs.getString("Cpf"));
                System.out.println(" Rg : " + rs.getString("Rg"));
                System.out.println(" Cep : " + rs.getString("Cep"));
                System.out.println(" Endereço : " + rs.getString("Endereco"));
                System.out.println(" Data : " + rs.getString("Data"));
                System.out.println(" Email : " + rs.getString("Email"));
                System.out.println(" Celular : " + rs.getString("Celular"));
                System.out.println(" Idade : " + rs.getString("Idade"));
                System.out.println(" Tipo Pessoa : " + rs.getString("TipoPessoa"));
                
                

                //System.out.println(" IDPAIS :" + rs.getString("IDPAIS").trim());
                //System.out.println(" NOME: " + rs.getString("NOME").trim());
                // System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());

        } // TODO add your handling code here: }//GEN-LAST:event_jButton1ActionPerformed

    }
}
