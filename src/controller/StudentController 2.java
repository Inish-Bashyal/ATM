package controller;
import databaseConnection.databaseconnection;
import model.Faculty;
import model.Student;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentController {
    databaseconnection db = new databaseconnection();

    public int registerStudentpreparedStatement(Student student) {
        try {
            String query = "insert into students(StudentId, stdFname, stdLname, stdGender, stdPhoneno, stdPassword, stdCourse, stdSemester,stdPphoneno, stdPemail)" +
                    " values(?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, student.getStudentId());
            st.setString(2, student.getstdFname());
            st.setString(3, student.getstdLname());
            st.setString(4, student.getstdGender());
            st.setString(5, student.getstdPhoneno());
            st.setString(6, student.getstdPassword());
            st.setString(7, student.getstdCourse());
            st.setString(8, student.getstdSemester());
            st.setString(9, student.getstdPhoneno());
            st.setString(10, student.getstdPemail());



            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }


    public int registerStudent (Student student)
    {
        String query;

        query="insert into students(StudentId, stdFname, stdLname, stdGender, stdPhoneno, stdPassword, stdCourse, stdSemester,stdPphoneno, stdPemail) values('"+
        student.getStudentId()+"','"+
        student.getstdFname()+"','"+
        student.getstdLname()+"','"+
        student.getstdGender()+"','"+
        student.getstdPhoneno()+"','"+
        student.getstdPassword()+"','"+
        student.getstdCourse()+"','"+
        student.getstdSemester()+"','"+
        student.getstdPphoneno()+"','"+
        student.getstdPemail()+"');";

        return db.manipulate(query);
    }






}
