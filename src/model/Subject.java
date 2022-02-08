package model;

public class Subject {

    private String subjectcode;
    private String subjectname;
    private String semester;
    private String subjectdesc;
    private String coursename;


    public Subject(){

    }

    public Subject(String subjectcode,String coursename, String subjectname,String semester, String subjectdesc) {
        this.subjectcode = subjectcode;
        this.coursename = coursename;
        this.subjectname = subjectname;
        this.semester = semester;
        this.subjectdesc = subjectdesc;
    
}
public String getsubjectcode(){
    return subjectcode;
}

public void setsubjectcode(String subjectcode){
    this.subjectcode = subjectcode;
}
public Object getcoursename(){
    return coursename;
}

public void setcoursename(String coursename){
    this.coursename = coursename;
}

public String getsubjectname(){
    return subjectname;
}

public void setsubjectname(String subjectname){
    this.subjectname = subjectname;
}

public Object getsemester(){
    return semester;
}

public void setsemester(String semester){
    this.semester = semester;
}
public String getSubjectdesc() {
    return subjectdesc;
}

public void setdesc(String subjectdesc) {
    this.subjectdesc = subjectdesc;
}



}