package controller;
import databaseConnection.databaseconnection;
import model.Student;

public class StudentController {
    databaseconnection db = new databaseconnection();

    public int addStudent (Student student)
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
