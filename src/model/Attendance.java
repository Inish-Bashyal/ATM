package model;

import java.util.Date;

public class Attendance {
    private int attendanceId;
    private String stdname;
    private String stdId;
    private String subjectname;
    private String attendancedate;
    private Object status;

    public  Attendance(){

    }
    public Attendance(String stdname,String stdId,String subjectname,String attendancedate,Object status){
        this.stdname=stdname;
        this.stdId=stdId;
        this.subjectname=subjectname;
        this.attendancedate=attendancedate;
        this.status=status;
    }

    public int getAttendanceId(){
        return attendanceId;
    }
    public void setAttendanceId(int attendanceId){
        this.attendanceId=attendanceId;
    }
    public String getStdname(){
        return stdname;
    }
    public void setStdname(String stdname){
        this.stdname=stdname;
    }
    public String getStdId(){
        return stdId;
    }
    public void setStdId(String stdId){
        this.stdId=stdId;
    }
    public String getSubjectname(){
        return subjectname;
    }
    public void setSubjectname(String subjectname){
        this.subjectname=subjectname;
    }
    public String getAttendancedate(){
        return attendancedate;
    }
    public void setAttendancedate(String attendancedate){
        this.attendancedate=attendancedate;
    }
    public Object getStatus(){
        return status;
    }
    public void setStatus(Object status){
        this.status=status;
    }

}
