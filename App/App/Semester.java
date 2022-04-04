package App;

public class Semester {
    private String Semester;

    public Semester() {
     this.Semester = "2022A";
    }

    public  Semester(String Semester) {
        this.Semester = Semester;
    }
    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    @Override
    public String toString() {
        return Semester;
    }
}
