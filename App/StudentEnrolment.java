package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolment {
    public static void main (String [] args) {
            Menu();


    }
    public static void Menu() {



        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an action:");
        System.out.println("1. Enroll Student");
        System.out.println("2. Update Enrolment");
        int input = scan.nextInt();
        if (input == 1 ) {
            enroll();
        }
        if (input == 2 ) {
            System.out.println("Updated");
        }



    }
    public static void enroll() {
        ArrayList<Student> StudentEnrollment = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Student ID:");
        String StudentID = scan.nextLine();
        System.out.println("Semester:");
        String Sem = scan.nextLine();
        System.out.println("Course:");
        String Course = scan.nextLine();


        Student Student = new Student(StudentID,Sem,Course);
        StudentEnrollment.add(Student);


        //System.out.println("Enrolled Student " + ID + '\n' + "on Semester " + Sem + '\n' + "to Course " + Course);
        for(Student elem : StudentEnrollment){
            System.out.println("enrolled" + elem);
        }

    }
}


