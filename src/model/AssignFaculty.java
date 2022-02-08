package model;

public class AssignFaculty {
    private int assigncode;
    private String facFname;
    private String subjectname;
    private String totalclass;

    public AssignFaculty(){

    }
    public AssignFaculty(String facFname,String subjectname,String totalclass){
        this.facFname=facFname;
        this.subjectname=subjectname;
        this.totalclass=totalclass;
    }
    public int getAssigncode(){
        return assigncode;
    }
    public void setAssigncode(int assigncode){
        this.assigncode=assigncode;
    }
    public String getFacFname(){
        return facFname;
    }
    public void setFacFname(String facFname){
        this.facFname=facFname;
    }
    public String getSubjectname(){
        return subjectname;
    }
    public void setSubjectname(String subjectname){
        this.subjectname=subjectname;
    }
    public String getTotalclass(){
        return totalclass;
    }
    public void setTotalclass(String totalclass){
        this.totalclass=totalclass;
    }

}
