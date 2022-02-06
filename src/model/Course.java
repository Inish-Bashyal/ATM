package model;

public class Course {
    private int idcourse;
    private String coursename;
    private String coursedesc;
    public Course(){

    }
    public Course( Integer idcourse, String coursename, String coursedesc) {
        this.coursename = coursename;
        this.coursedesc = coursedesc;
    }

     public int getidcourse(){
         return idcourse;
     }

     public void setidcourse(int idcourse){
         this.idcourse = idcourse;
     }


    public String getcoursename(){
        return coursename;
    }

    public void setcoursename(String coursename){
        this.coursename = coursename;
    }
    public String getcoursedesc(){
        return coursedesc;
    }

    public void setcoursedesc(String coursedesc){
        this.coursedesc = coursedesc;
    }


}