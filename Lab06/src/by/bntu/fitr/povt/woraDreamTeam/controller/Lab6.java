package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.controller;

import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.model.logic.Equation;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.model.logic.RectangleMath;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.util.UserInput;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.view.Printer;

public class Lab6 {
    public static void main(String[] args) {
        int ch = (int)UserInput.input("Please, choose the operation: 1- rectangle operations, 2 - equation");
        if (ch == 1) {
            double x1 = UserInput.input("Input x1: ");
            double y1 = UserInput.input("Input y1: ");
            double x2 = UserInput.input("Input x2: ");
            double y2 = UserInput.input("Input y2: ");

            double s = RectangleMath.CalculateArea(x1, y1, x2, y2);
            double p = RectangleMath.CalculatePerimeter(x1, y1, x2, y2);

            Printer.print("Rectangle with coord x1= " + x1 + " y1= " + y1 + " x2= " + x2 + " y2 = " + y2);
            Printer.print("S = " + s);
            Printer.print("P = " + p);
        } else{
            Printer.print("An equation type is: Ax + b = 0");
            double a = UserInput.input("Input A: ");
            double b = UserInput.input(("Input B: "));
            double x = Equation.calculate(a,b);
            Printer.print("x = " + x);
        }
    }
}
