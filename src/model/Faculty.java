package model;

public class Faculty {
    private int LoginId;
    private String facFname;
    private String facLname;
    private String gender;
    private String phoneNo;
    private String dateOfBirth;
    private String username;
    private String password;

    public Faculty(){

    }
    public Faculty(String facFname, String facLname, String gender, String phoneNo, String dateOFBirth, String username,
                   String password) {
        this.facFname = facFname;
        this.facLname = facLname;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOFBirth;
        this.username = username;
        this.password = password;
    }

    public int getLoginId(){
        return LoginId;
    }

    public void setLoginId(int LoginId){
        this.LoginId = LoginId;
    }

    public String getfacFname(){
        return facFname;
    }

    public void setfacFname(String facFname){
        this.facFname = facFname;
    }

    public String getfacLname(){
        return facLname;
    }

    public void setfacLname(String facFname){
        this.facLname = facLname;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
