package databaseConnection;

import java.sql.*;

public class databaseconnection {

    public Connection con;
    Statement st;
    ResultSet rows;
    int val;

    public databaseconnection() {
        // register the driver class
        try {
            String username = "root";
            String password = "B@shyal2015";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection(
                    
                    "jdbc:mysql://localhost:3306/attendancemanagementsystem", username, password);

            if (con != null) {
                System.out.println("Connected to Coders Database");
            } else {
                System.out.println("Error connecting Database");
            }
            // creating statement object
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // method to insert data using prepared statement
    public int manipulate(PreparedStatement st) {
        try {
            val = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return val;
    }

    // Used for insert, update, delete
    public int manipulate(String query) {
        try {
            val = st.executeUpdate(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return val;
    }


    // Used for select
    public ResultSet retrieve(String query) {
        try {
            rows = st.executeQuery(query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    public static void main(String[] args) {
        new databaseconnection();
    }
}
