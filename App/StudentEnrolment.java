package App;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEnrolment {
        public static void main (String [] args) {
            Menu();
            String student;
            String course;
            String semester;
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Student ID:");
        String ID = scan.nextLine();
        System.out.println("Semester:");
        String Sem = scan.nextLine();
        System.out.println("Course:");
        String Course = scan.nextLine();

        System.out.println("Enrolled Student " + ID + '\n' + "on Semester " + Sem + '\n' + "to Course " + Course);
    }
}


