package App;


import java.util.ArrayList;

public class Student {
    private String StudentID;
    private String StudentName;
    private String BirthDate;
    private ArrayList<Student> StudentList;

    public Student(String StudentName, String StudentID, String BirthDate) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.BirthDate = BirthDate;
        this.StudentList = new ArrayList<Student>();
    }

    public String getStudentName () {
        return StudentName;
    }
    public String getStudentID () {
        return StudentID;
    }
    public String getBirthDate () {
        return BirthDate;
    }
    public ArrayList<Student> getStudentList () {
        return StudentList;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Student Name='" + StudentName + '\'' +
                ", ID='" + StudentID + '\'' +
                '}';
    }
}
