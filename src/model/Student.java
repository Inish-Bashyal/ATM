package model;

public class Student {
    private String StudentId;
    private String stdFname;
    private String stdLname;
    private String stdGender;
    private String stdPhnoneno;
    private String stdPassword;
    private String stdCourse;
    private String stdSemester;
    private String stdPphoneno;
    private String stdPemail;
    
 
    public Student(){

    }


    public Student (String StudentId, String stdFname, String stdLname,String stdGender, String stdPhoneno, String stdPassword,String stdCourse,String stdSemester, String stdPphoneno,String stdPemail)
    {
        this.StudentId = StudentId;
        this.stdFname = stdFname;
        this.stdLname = stdLname;
        this.stdGender = stdGender;
        this.stdPhnoneno = stdPhoneno;
        this.stdPassword = stdPassword;
        this.stdCourse = stdCourse;
        this.stdSemester = stdSemester;
        this.stdPphoneno = stdPphoneno;
        this.stdPemail = stdPemail;
    }

    public String getStudentId(){
        return StudentId;
    }
    public void setStudentId(String StudentId){
        this.StudentId=StudentId;
    }
    public String getStdFname(){
        return stdFname;
    }
    public void setStdFname(String stdFname){
        this.stdFname=stdFname;
    }
    public String getStdLname(){
        return stdLname;
    }
    public void setStdLname(String stdLname){
        this.stdLname=stdLname;
    }
    public String getStdGender(){
        return stdGender;
    }
    public void setStdGender(String stdGender){
        this.stdGender=stdGender;
    }
    public String getStdPhnoneno(){
        return stdPhnoneno;
    }
    public void setStdPhnoneno(String stdPhnoneno){
        this.stdPhnoneno=stdPhnoneno;
    }
    public String getStdCourse(){
        return stdCourse;
    }
    public void setStdCourse(String stdCourse){
        this.stdCourse=stdCourse;
    }
    public String getStdSemester(){
        return stdSemester;
    }
    public void setStdSemester(String stdSemester){
        this.stdSemester=stdSemester;
    }
    public String getStdPphoneno(){
        return stdPphoneno;
    }
    public void setStdPphoneno(String stdPphnoneno){
        this.stdPphoneno=stdPphnoneno;
    }
    public String getStdPemail(){
        return stdPemail;
    }
    public void setStdPemail(String stdPemail){
        this.stdPemail=stdPemail;
    }
    public String getStdPassword(){
        return stdPassword;
    }
    public void setStdPassword(String stdPassword){
        this.stdPassword=stdPassword;
    }
}
