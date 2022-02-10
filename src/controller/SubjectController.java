package controller;

import databaseConnection.databaseconnection;
import model.Faculty;
import model.Subject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SubjectController {
    databaseconnection db = new databaseconnection();

    public int registerSubjectpreparedStatement(Subject subject) {
        try {
            String query = "insert into subject(subjectname,subjectcode,coursename,subjectdesc,semester) values(?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(2, subject.getsubjectcode());
            st.setString(1, subject.getsubjectname());
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

        query = "insert into subject(subjectcode,coursename,subjectname,subjectdesc,semester)values('"+
                subject.getsubjectcode()+"','"+
                subject.getsubjectname()+"','"+
                subject.getcoursename()+"','"+
                subject.getSubjectdesc()+"','"+
                subject.getsemester()+"')";
        
    return db.manipulate(query);

    }

    public List<Subject> getAllSubjects() {
        String query;
        query = "select * from subject";
        db = new databaseconnection();
        ResultSet rs = db.retrieve(query);

        List<Subject> lstSubjects = new ArrayList<Subject>();

        try {
            while (rs.next()) {
                Subject subject = new Subject();

                subject.setsubjectcode(rs.getString("subjectcode"));
                subject.setsubjectname(rs.getString("subjectname"));
                subject.setcoursename(rs.getString("coursename"));
                subject.setSubjectdesc(rs.getString("subjectdesc"));
                subject.setsemester(rs.getString("semester"));


                lstSubjects.add(subject);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstSubjects;
    }


}
