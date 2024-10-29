package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBcontext {

    protected Connection connection;

    public DBcontext() {
        try {
            String user = "giapp";
            String pass = "123@";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=CuaHang";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
