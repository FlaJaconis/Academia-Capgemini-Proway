package aula35.View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aula35.utils.ConnectionFactory;

public class View4 {
    try(Connection conn = new ConnectionFactory().getConnection()) {            
            
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();
        while(result.next()){
            int id = result.getInt("id");
            String nome = result.getString("nome");
            System.out.printf("%d - %s\n", id, nome);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}}
