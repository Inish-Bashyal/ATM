package test.databaseConnection;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseconnectionTest {
        public static void main(String[] args) throws Exception {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement stat = conn.createStatement();
            stat.executeUpdate("drop table if exists people;");
            stat.executeUpdate("create table people (name, occupation);");
            PreparedStatement prep = conn.prepareStatement(
                    "insert into people values (?, ?);");

            prep.setString(1, "Inish");
            prep.setString(2, "BTech");
            prep.addBatch();
            prep.setString(1, "Bibhas");
            prep.setString(2, "IT");
            prep.addBatch();
            prep.setString(1, "Manish");
            prep.setString(2, "BTech");
            prep.addBatch();

            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);

            ResultSet rs = stat.executeQuery("select * from people;");
            while (rs.next()) {
                System.out.println("name = " + rs.getString("name"));
                System.out.println("class = " + rs.getString("subject"));
            }
            rs.close();
            conn.close();
        }
    }


