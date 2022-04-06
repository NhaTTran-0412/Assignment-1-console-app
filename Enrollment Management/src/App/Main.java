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
        String input ="";
        while (true) {
            System.out.println("Student Enrolment");
            System.out.println(Add + " Add");
            System.out.println(Update + " Update");
            System.out.println(Delete + " Delete");
            System.out.println(GetOne + " Get one");
            System.out.println(GetAll + " Get all");
            System.out.println(Export + " Export to CSV");
            System.out.println(Exit + " Exit");

            while(true) {
                System.out.print("Choose an option: ");
                input = scanner.nextLine();
                choice = Integer.parseInt(input);
                break;
            }

            switch (choice) {
                case Add -> StudentEnrolment.addList();
                case Update -> StudentEnrolment.Edit();
                case Delete -> StudentEnrolment.deleteList();
                case Export -> StudentEnrolment.exportList();
                case Exit -> isExit = true;
                default -> System.out.println("Invalid input");
            }

            if(isExit) {
                break;
            }

            clearConsole();
            System.out.println("Press enter to continue");

            while (input !=null) {
                if (input.isEmpty()) {
                    break;
                }
                if (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                } else {
                    input = null;
                }
            }

        }

    }

    private static void clearConsole() {
        System.out.println("-------------------------------------");
    }

}