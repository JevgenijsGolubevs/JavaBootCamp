package sef.FinalActivity;

public class Students extends Person {

    private String schoolName;

    public String introduceStudent(){
        return "Im study in university" + schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
