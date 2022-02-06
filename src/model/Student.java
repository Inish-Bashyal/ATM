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
        this.StudentId = StudentId;
    }

    public String getstdFname(){
        return stdFname;
    }
    public void setstdFname(String stdFname){
        this.stdFname = this.stdFname;
    }

    public String getstdLname(){
        return stdLname;
    }
    public void setstdLname(String stdLname){
        this.stdLname = this.stdLname;
    }

    public String getstdGender(){
        return stdGender;
    }
    public void setstdGender(String stdGender){
        this.stdGender = this.stdGender;
    }

    public String getstdPassword(){
        return stdPassword;
    }
    public void setstdPassword(){
        this.stdPassword = stdPassword;
    }

    public String getstdPhoneno(){
        return stdPhnoneno;
    }
    public void setstdPhoneno(String stdPhoneno){
        this.stdPhnoneno = stdPhnoneno;
    }

    public String getstdCourse(){
        return stdCourse;
    }
    public void setstdCourse(String stdCourse){
        this.stdCourse = this.stdCourse;
    }

    public String getstdSemester(){
        return stdSemester;
    }
    public void setstdSemester(String stdSemester){
        this.stdSemester = this.stdSemester;
    }

    public String getstdPphoneno(){
        return stdPphoneno;
    }
    public void setstdPphoneno(String stdPphoneno){
        this.stdPphoneno = this.stdPphoneno;
    }

    public String getstdPemail(){
        return stdPemail;
    }
    public void setstdPemail(String stdPemail){
        this.stdPemail = this.stdPemail;
    }













}
