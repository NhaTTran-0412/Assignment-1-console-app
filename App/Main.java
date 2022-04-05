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
            System.out.println("Student Enrolment");
            System.out.println(Add + " Add");
            System.out.println(Update + " Update");
            System.out.println(Delete + " Delete");
            System.out.println(GetOne + " Get one");
            System.out.println(GetAll + " Get all");
            System.out.println(Exit + " Exit");

            while(true) {
                System.out.print("Choose an option: ");
                Temp = scanner.nextLine();
                choice = Integer.parseInt(Temp);
                break;
            }

            switch (choice) {
                case Add:
                    StudentEnrolment.addList();
                    break;
                case Update:
                    StudentEnrolment.Edit();
                    break;
                case Delete:
                    StudentEnrolment.deleteList();
                    break;
                case Exit:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            if(isExit) {
                break;
            }

            clearConsole();
            System.out.println("Press enter to continue");

            while (Temp !=null) {
                if (Temp.isEmpty()) {
                    break;
                }
                if (scanner.hasNextLine()) {
                    Temp = scanner.nextLine();
                } else {
                    Temp = null;
                }
            }

        }

    }

    private static void clearConsole() {
        System.out.println("-------------------------------------");
    }

}