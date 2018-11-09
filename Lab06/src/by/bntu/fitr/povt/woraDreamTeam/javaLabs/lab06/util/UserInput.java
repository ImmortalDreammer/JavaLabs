package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.util;
import java.util.Scanner;
public class UserInput {
    public static double input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        double a = scanner.nextDouble();
        return a;
    }
}
