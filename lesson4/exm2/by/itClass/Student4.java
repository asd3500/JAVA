package exm2.by.itClass;

public class Student4 extends Person4{
    private String faculty;

    public Student4() {
        super();
    }

    public Student4(String paramName, int paramAge, String faculty) {
        super(paramName, paramAge);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String info() {
        return super.info() + ", faculty:" + faculty;
    }
}
