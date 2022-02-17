package controller;
import databaseConnection.databaseconnection;
import model.Course;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseController {
    databaseconnection db = new databaseconnection();

    public int registerCoursepreparedStatement(Course course) {
        try {
            String query = "insert into course(coursename,coursedesc) values(?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, course.getcoursename());
            st.setString(2, course.getcoursedesc());

            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int addCourse (Course course)
    {
        String query;
        query="insert into course(coursename,coursedesc) values('"+
        // course.getidcourse()+"','"+
        course.getcoursename()+"','"+
        course.getcoursedesc()+"');";
       return db.manipulate(query);
    }
    public List<Course> getAllCourses() {
        String query;
        query = "select * from course";
        db = new databaseconnection();
        ResultSet rs = db.retrieve(query);
        List<Course> lstCourses = new ArrayList<Course>();
        try {
            while (rs.next()) {
                Course course = new Course();
                course.setidcourse(rs.getInt("idcourse"));
                course.setcoursename(rs.getString("coursename"));
                course.setcoursedesc(rs.getString("coursedesc"));
                lstCourses.add(course);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
        return lstCourses;
    }

}
