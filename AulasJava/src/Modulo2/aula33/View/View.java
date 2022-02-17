package aula33.View;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String pwd = "fla169";

            
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
           
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            conn.close();
            
            //ou
            //Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "fla169");
        
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar com o servidor.");
        }
    }
}
