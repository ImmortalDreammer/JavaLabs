package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model;
import java.util.Random;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.view.Printer;

public class Dice {
    public static int DiceSum() {
        Random rand = new Random();
        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
        int sum = a + b;
        Printer.print("Points of first dice: " + a);
        Printer.print("Points of second dice: " + b);
        return sum;
    }
}

