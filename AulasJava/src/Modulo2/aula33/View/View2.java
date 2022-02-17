package aula33.View;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;

public class View2 {

    public static void main(String[] args) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "fla169");

            // Statement - query SQL
            Statement statement = conn.createStatement();
            statement.execute("SELECT* FROM PRODUTO");

            // Result = retorno da consulta
            ResultSet result = statement.getResultSet();

            // Imprimir resultado
            while (result.next()) {

                int id = result.getInt("id");
                String nome = result.getString("nome");
                String desc = result.getString("descricao");
                int preco = result.getInt("preco");
                System.out.printf("Id: %d, Nome: %s, Descrição: %s, Preço: %d\n", id, nome, desc, preco);

            }
            conn.close();

        } catch (SQLException e) {
            // System.out.println("Não foi possível conectar com o servidor.");
            e.printStackTrace();
        }
    }

}
