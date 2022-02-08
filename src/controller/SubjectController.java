package controller;

import databaseConnection.databaseconnection;
import model.Subject;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SubjectController {
    databaseconnection db = new databaseconnection();

    public int registerSubjectpreparedStatement(Subject subject) {
        try {
            String query = "insert into subject(subjectname,subjectcode,coursename,subjectdesc,semester) values(?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, subject.getsubjectname());
            st.setString(2, subject.getsubjectcode());
            st.setString(3, (String) subject.getcoursename());
            st.setString(4, subject.getSubjectdesc());
            st.setString(5, (String) subject.getsemester());


            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }


    public int registerSubject(Subject subject)
    {
        String query;

        query = "insert into subject(subjectcode,subjectname,coursename,subjectdesc,semester)values('"+
                subject.getsubjectcode()+"','"+
                subject.getsubjectname()+"','"+
                subject.getcoursename()+"','"+
                subject.getSubjectdesc()+"','"+
                subject.getsemester()+"')";
        
    return db.manipulate(query);

    }
    
}
