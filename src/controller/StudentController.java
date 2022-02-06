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
            st.setString(2, student.getstdFname());
            st.setString(3, student.getstdLname());
            st.setString(4, student.getstdGender());
            st.setString(5, student.getstdPhoneno());
            st.setString(6, student.getstdCourse());
            st.setString(7, student.getstdSemester());
            st.setString(8, student.getstdPhoneno());
            st.setString(9, student.getstdPemail());
            st.setString(10, student.getstdPassword());




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
        student.getstdFname()+"','"+
        student.getstdLname()+"','"+
        student.getstdGender()+"','"+
        student.getstdPhoneno()+"','"+
        student.getstdCourse()+"','"+
        student.getstdSemester()+"','"+
        student.getstdPphoneno()+"','"+
        student.getstdPemail()+"','"+
        student.getstdPassword()+"');";

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
                student.setstdFname(rs.getString("stdFname"));
                student.setstdLname(rs.getString("stdLname"));
                student.setstdGender(rs.getString("stdGender"));
                student.setstdPhoneno(rs.getString("stdPhoneno"));
                student.setstdCourse(rs.getString("stdCourse"));
                student.setstdSemester(rs.getString("stdSemester"));
                student.setstdPphoneno(rs.getString("stdPphoneno"));
                student.setstdPemail(rs.getString("stdPemail"));

                lstStudents.add(student);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstStudents;
    }



}
