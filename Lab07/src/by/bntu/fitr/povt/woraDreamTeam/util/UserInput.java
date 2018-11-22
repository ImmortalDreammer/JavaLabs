package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.util;
import java.util.Scanner;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.view.Printer;
public class UserInput {
    public static double inputDouble(String msg) {
        Scanner scanner = new Scanner(System.in);
        double a;
        while (true) {
            System.out.println(msg);
            if(scanner.hasNextDouble()){
                a = scanner.nextDouble();
                break;
            } else{
            Printer.print("You entered a wrong symbol. The type must be double. Please try again :) ");
            scanner.nextLine();
            }
        }
        return a;
    }

    public static char inputChar(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        char a = scanner.next().charAt(0);
        return a;
    }

    public static int inputInt(String msg){
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println(msg);
            if(scanner.hasNextInt()){
                a = scanner.nextInt();
                break;
            } else {
                Printer.print("You entered a wrong symbol. The type must be integer. Please try again :) ");
                scanner.nextLine();
            }
        }
        return a;
    }
}
