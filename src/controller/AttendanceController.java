package controller;
import databaseConnection.databaseconnection;
import model.Attendance;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AttendanceController {
    databaseconnection db = new databaseconnection();


    public int registerAttendancepreparedStatement(Attendance attendance) {
        try {
            String query = "insert into attendance(stdname,stdId,subjectname,attendancedate,status)values(?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, attendance.getStdname());
            st.setString(2, attendance.getStdId());
            st.setString(3, attendance.getSubjectname());
            st.setString(4,  attendance.getAttendancedate());
            st.setObject(5, attendance.getStatus());


            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Attendance> getAllAttendance() {
        String query;
        query = "select * from attendance";
        db = new databaseconnection();
        ResultSet rs = db.retrieve(query);
        List<Attendance> lstAttendances = new ArrayList<Attendance>();
        try {
            while (rs.next()) {
                Attendance attendance = new Attendance();
                attendance.setStdname(rs.getString("stdname"));
                attendance.setStdId(rs.getString("stdId"));
                attendance.setSubjectname(rs.getString("subjectname"));
                attendance.setAttendancedate(rs.getString("attendancedate"));
                attendance.setStatus(rs.getString("status"));

                lstAttendances.add(attendance);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
        return lstAttendances;
    }
}
