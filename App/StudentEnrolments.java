package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolments {
    private List<String> EnrolList = new ArrayList<>();
    public List<String> getEnrolList() {
        return EnrolList;


    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("choose an action");
        int choose = input.nextInt();
        if
    }

}
interface StudentEnrolmentManagement {
    void main();
    void add();
    void update();
    void delete();
    void getOne();
    void getAll();
}
abstract class add implements StudentEnrolmentManagement {
    public void add() {
        System.out.print("Enroll student");

    }
    public static void Enroll(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student ID: ");
        String StudentID = input.nextLine();
        System.out.println("Semester: ");
        String Semester = input.nextLine();
        System.out.println("Course need to enroll: ");
        String Course = input.nextLine();


    }
}
