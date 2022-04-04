package App;

import java.util.ArrayList;

public class Course {
    private String CourseID;
    private String CourseName;
    private String NumberOfCredits;
    private ArrayList<Course> CourseList;

    public Course(String CourseID, String CourseName, String NumberOfCredits) {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.NumberOfCredits = NumberOfCredits;
        this.CourseList = new ArrayList<Course>();
    }

    public String getCourseID () {
        return CourseID;
    }
    public String getCourseName () {
        return CourseName;
    }
    public String getNumberOfCredits () {
        return NumberOfCredits;
    }
    public ArrayList<Course> getCourseList () {
        return CourseList;
    }
    public String toString () {
        return "Course:" +
                "Course Name: " + CourseName + '\'' +
                "course ID: " + CourseID + '\'' +
                "Credits: " + NumberOfCredits;
    }
}
