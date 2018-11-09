package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.view.Printer;
public class TheGreatest {
    public static double greatest(double a, double b, double c){
        if (a > b){
            if (a < c) {
                return c;
            } else if(a == c){
                Printer.print("a and c are equal");
                return a;
            } else{
                return a;
            }
        } else if(a < b){
            if (b < c) {
                return c;
            } else if(b == c){
                Printer.print("b and c are equal");
                return b;
            } else{
                return b;
            }
        } else {
            if(a>c){
                Printer.print("a and b are equal");
                return a;
            } else if(a == c){
                Printer.print("a, b, c are equal");
                return a;
            } else{
                return c;
            }
        }
    }
}

