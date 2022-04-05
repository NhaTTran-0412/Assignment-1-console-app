package App;

import java.util.ArrayList;
import java.util.Scanner;

public final class StudentEnrolment {
    private static int choice;

    private static Scanner input;

    private static ArrayList<Student> StudentList = new ArrayList<>();
    public static boolean isEmptyList() {
        return (StudentList.size() == 0);

    }

    public static boolean IDExisted(final int id) {
        for (Student Student : StudentList) {
            if (Student.getStudentID() == id) {
                return true;
            }
        }
        return false;
    }

    private StudentEnrolment(){

    }
    public static void init() {
        choice = 0;
        input = new Scanner(System.in);
        StudentList.clear();
    }

    public static void Edit() {
        String TempString = "";
        int StudentID = 0;

        System.out.print("Student ID: ");
        TempString = input.nextLine();

        if (IDExisted(StudentID)) {
            StudentList.add(createStudent(CheckID = false));
            System.out.print("Add Complete");
        } else {
            System.out.print("ID does nto exist");
        }
    }
    public static void addList() {
        Student newStudent = createStudent(CheckID = true);
        StudentList.add(newStudent);
        System.out.println("Added a student");
    }

    private static Student createStudent(final boolean CheckID) {
        String TempString ="";
        Student newStudent = new Student();
        TempString = "";

        System.out.print("Student ID    :");
        TempString = input.nextLine();
        int id = Integer.parseInt(TempString);
        if (CheckID) {
            if (IDExisted(id)) {
                System.out.println("ID already existed");
            } else {
                newStudent.setStudentID(id);
            }
        }

        System.out.print("Student Name  :");
        TempString = input.nextLine();

        System.out.print("Semester      :");
        TempString = input.nextLine();
        System.out.print("Enrol Course  :");
        TempString = input.nextLine();
    }

        public static void deleteList() {
            String TempString = "";
            int StudentID = 0;

            System.out.print("Student ID     :");
            TempString = input.nextLine();
            if (IDExisted(StudentID)) {
                StudentList.remove(StudentID);
                System.out.println("Deleted student");
        } else {
                System.out.println("Student ID does not exist");
            }
    }
}
