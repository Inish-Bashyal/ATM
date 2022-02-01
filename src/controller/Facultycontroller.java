package controller;

import com.mysql.cj.xdevapi.PreparableStatement;

import databaseConnection.databaseconnection;
import model.Faculty;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import databaseConnection.databaseconnection;

public class Facultycontroller {
    databaseconnection db = new databaseconnection();

    public int addFacultyPreparedStatement(Faculty faculty)
    {

        String query;

        query ="insert into faculty( facFname, facLname,  gender,  phoneNo,  dateOfBirth,  username,password) values('"+
                faculty.getfacFname() +"','" +
                faculty.getfacLname()+"','"+
                faculty.getGender()+"','"+
                faculty.getPhoneNo()+"','"+
                faculty.getDateOfBirth()+"','"+
                faculty.getUsername()+"','"+
                faculty.getPassword()+"');";

        return db.manipulate(query);



    }

    // Login faculty
    public Faculty loginFaculty(String username, String password) {
        String query;
        query = "select * from faculty where username = '" + username +
                "' and password = '" + password + "';";

        ResultSet rs = db.retrieve(query);
        Faculty faculty = null;

        try {
            while (rs.next()) {
                faculty = new Faculty();
                faculty.setLoginId(rs.getInt("LoginId"));
                faculty.setfacFname(rs.getString("factFname"));
                faculty.setfacLname(rs.getString("factLname"));
                faculty.setGender(rs.getString("gender"));
                faculty.setDateOfBirth(rs.getString("dateOfBirth"));
                faculty.setUsername(rs.getString("username"));
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return faculty;
    }

    public List<Faculty> getAllFacultys() {
        String query;
        query = "select * from faculty";
        db = new databaseconnection();
        ResultSet rs = db.retrieve(query);

        List<Faculty> lstFacultys = new ArrayList<Faculty>();

        try {
            while (rs.next()) {
                Faculty faculty = new Faculty();

                faculty.setLoginId(rs.getInt("LoginId"));
                faculty.setfacFname(rs.getString("factFname"));
                faculty.setfacLname(rs.getString("factLname"));
                faculty.setGender(rs.getString("gender"));
                faculty.setPhoneNo(rs.getString("phoneNo"));
                faculty.setDateOfBirth(rs.getString("dateOfBirth"));
                faculty.setUsername(rs.getString("username"));

                lstFacultys.add(faculty);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstFacultys;
    }


}
