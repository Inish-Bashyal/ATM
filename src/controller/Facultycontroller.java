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


    public int registerFacultypreparedStatement(Faculty faculty) {
        try {
            String query = "insert into faculty(facFname,facLname,gender,phoneNo," +
                    "dateOfBirth,username,password) values(?,?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, faculty.getfacFname());
            st.setString(2, faculty.getfacLname());
            st.setString(3, faculty.getGender());
            st.setString(4, faculty.getPhoneNo());
            st.setString(5, faculty.getDateOfBirth());
            st.setString(6, faculty.getUsername());
            st.setString(7, faculty.getPassword());

            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }


    public int registerFaculty(Faculty faculty)
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
                faculty.setfacFname(rs.getString("facFname"));
                faculty.setfacLname(rs.getString("facLname"));
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
