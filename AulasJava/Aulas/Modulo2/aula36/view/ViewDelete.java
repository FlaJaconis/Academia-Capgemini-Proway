package aula36.view;

import java.sql.Connection;
import java.sql.SQLException;

import aula36.dao.CategoriaDao;
import aula36.dao.ConnectionFactory;
import aula36.model.Categoria;

public class ViewDelete {
    try(Connection conn = new ConnectionFactory().getConnection()) 
    {            
        CategoriaDao dao = new CategoriaDao(conn);
        dao.delete(25);   
    } catch (SQLException e) {
        e.printStackTrace();
    }
}}
