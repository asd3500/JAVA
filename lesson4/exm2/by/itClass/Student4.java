package exm2.by.itClass;

public class Student4 extends Person4{
    private String faculty;

    public Student4() {
        super();
        faculty = "";
    }

    public Student4(String paramFaculty) {
        super();
        faculty = paramFaculty;
    }

    public Student4(String paramName, int paramAge, String paramFaculty) {
        // super(paramName, paramAge);
        setName(paramName); // name - private
        age = paramAge; // age - protected
        faculty = paramFaculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String paramFaculty) {
        faculty = paramFaculty;
    }

    public String info() {
        return super.info() + ", faculty:" + faculty;
    }
}
