package controller;

import databaseConnection.databaseconnection;
import model.AssignFaculty;
import model.Faculty;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AssignFacultyController {
    databaseconnection db = new databaseconnection();

    public int registerFacultypreparedStatement(AssignFaculty assignFaculty) {
        try {
            String query = "insert into assignfaculty(facFname,subjectname,totalclass) values(?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, assignFaculty.getFacFname());
            st.setString(2, assignFaculty.getSubjectname());
            st.setString(3, assignFaculty.getTotalclass());


            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int registerFaculty(AssignFaculty assignFaculty)
    {

        String query;

        query ="insert into assignfaculty(facFname,subjectname,totalclass) values('"+
                assignFaculty.getFacFname() +"','" +
                assignFaculty.getSubjectname()+"','"+
                assignFaculty.getTotalclass()+"');";

        return db.manipulate(query);

    }
    public List<AssignFaculty> getAllAssignFacultys() {
        String query;
        query = "select * from assignfaculty";
        db = new databaseconnection();
        ResultSet rs = db.retrieve(query);

        List<AssignFaculty> lstAssignFacultys = new ArrayList<AssignFaculty>();

        try {
            while (rs.next()) {
                AssignFaculty assignFaculty = new AssignFaculty();

                assignFaculty.setAssigncode(rs.getInt("assigncode"));
                assignFaculty.setFacFname(rs.getString("facFname"));
                assignFaculty.setSubjectname(rs.getString("subjectname"));
                assignFaculty.setTotalclass(rs.getString("totalclass"));


                lstAssignFacultys.add(assignFaculty);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstAssignFacultys;
    }


}
