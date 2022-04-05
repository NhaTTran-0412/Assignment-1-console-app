package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static App.Function.*;


public final class Main {
    private static Scanner scanner;

    private static int choice;

    private Main() {

    }

    public static void main(String[] args) {
        choice = 0;
        scanner = new Scanner(System.in);

        StudentEnrolment.init();


        Boolean isExit = false;
        String Temp ="";
        while (true) {
            System.out.print("Student Enrolment");
            System.out.print("1" + Add + "Add student");
            System.out.print("2" + Update + "Update student");
            System.out.print("3" + Delete + "Delete student");
            System.out.print("4" + GetOne + "Get one student");
            System.out.print("5" + GetAll + "Get all student");

            System.out.println("Choose an option");
            Temp = scanner.nextLine();
            choice = Integer.parseInt(Temp);

        }

        switch (choice) {
            case Add -> StudentEnrolment.addList();
            case Update -> StudentEnrolment.Edit();
            case Delete -> StudentEnrolment.deleteList();
            case Exit -> isExit = true;
            default -> System.out.println("Invalid input");
        }
        if(isExit) {
        }
    }

}