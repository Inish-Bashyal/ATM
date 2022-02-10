package controller;
import databaseConnection.databaseconnection;

import model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    databaseconnection db = new databaseconnection();

    public int registerStudentpreparedStatement(Student student) {
        try {
            String query = "insert into students(StudentId, stdFname, stdLname, stdGender, stdPhoneno, stdCourse, stdSemester,stdPphoneno, stdPemail, stdPassword)" +
                    " values(?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, student.getStudentId());
            st.setString(2, student.getStdFname());
            st.setString(3, student.getStdFname());
            st.setString(4, student.getStdGender());
            st.setString(5, student.getStdPhnoneno());
            st.setString(6, student.getStdCourse());
            st.setString(7, student.getStdSemester());
            st.setString(8, student.getStdPphoneno());
            st.setString(9, student.getStdPemail());
            st.setString(10, student.getStdPassword());




            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }


    public int registerStudent (Student student)
    {
        String query;

        query="insert into students(StudentId, stdFname, stdLname, stdGender, stdPhoneno, stdCourse, stdSemester,stdPphoneno, stdPemail,stdPassword) values('"+
        student.getStudentId()+"','"+
        student.getStdFname()+"','"+
        student.getStdLname()+"','"+
        student.getStdGender()+"','"+
        student.getStdPhnoneno()+"','"+
        student.getStdCourse()+"','"+
        student.getStdSemester()+"','"+
        student.getStdPphoneno()+"','"+
        student.getStdPemail()+"','"+
        student.getStdPassword()+"');";

        return db.manipulate(query);
    }

    public List<Student> getAllStudents() {
        String query;
        query = "select * from students";
        db = new databaseconnection();
        ResultSet rs = db.retrieve(query);

        List<Student> lstStudents = new ArrayList<Student>();

        try {
            while (rs.next()) {
                Student student = new Student();

                student.setStudentId(rs.getString("StudentId"));
                student.setStdFname(rs.getString("stdFname"));
                student.setStdLname(rs.getString("stdLname"));
                student.setStdGender(rs.getString("stdGender"));
                student.setStdPhnoneno(rs.getString("stdPhoneno"));
                student.setStdCourse(rs.getString("stdCourse"));
                student.setStdSemester(rs.getString("stdSemester"));
                student.setStdPphoneno(rs.getString("stdPphoneno"));
                student.setStdPemail(rs.getString("stdPemail"));

                lstStudents.add(student);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstStudents;
    }



}
