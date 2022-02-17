package aula37.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import aula37.model.Categoria;
import aula37.utils.ConnectionFactory;

public class ViewDelete{
    public static void main(String[] args) {
        // try with resources
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {    
            Categoria model = new Categoria();
            model.setId(28);      

            String sql = "DELETE FROM categoria WHERE id = ?";

            try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, model.getId());
                prepStatement.execute();   
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);    
            } catch (Exception e) {
                e.printStackTrace();
            }            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
