package DBConnection;

import java.sql.*;
import javax.sql.*;
import javax.sql.*;
public class CreateConnection {

	public static final String username = "root";
    public static final String password = ""; // Use an empty string for a blank password
    public static final String url = "jdbc:mysql://localhost:3306/tns";

    public static Connection getConnection() {
            Connection cn = null;
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");

                
                cn = DriverManager.getConnection(url, username, password);
                System.out.println("Connection established: " + cn);

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            return cn;
        }
    }