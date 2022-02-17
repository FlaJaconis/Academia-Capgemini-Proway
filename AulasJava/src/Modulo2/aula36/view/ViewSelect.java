package aula36.view;

import java.sql.Connection;
import java.sql.SQLException;

import aula36.dao.CategoriaDao;
import aula36.dao.ConnectionFactory;
import aula36.model.Categoria;

public class ViewSelect {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {            
           CategoriaDao dao = new CategoriaDao(conn);

           for (Categoria c : dao.list()) {
               System.out.println(c);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
