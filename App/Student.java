package App;


import java.util.ArrayList;

public class Student {
    private static int StudentID;
    private String StudentName;
    private String BirthDate;

    public Student(final String StudentName, final int StudentID, final String BirthDate) {
        super();
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.BirthDate = BirthDate;
    }

    public Student() {
        super();
    }

    public String getStudentName () {
        return StudentName;
    }
    public static int getStudentID() {
        return StudentID;
    }
    public String getBirthDate () {
        return BirthDate;
    }

    public void setStudentID(final int inputID) {
        this.StudentID = inputID;
    }
    public void setStudentName(final String inputName) {
        this.StudentName = inputName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Student Name='" + StudentName + '\'' +
                ", ID='" + StudentID + '\'' +
                '}';
    }
}
