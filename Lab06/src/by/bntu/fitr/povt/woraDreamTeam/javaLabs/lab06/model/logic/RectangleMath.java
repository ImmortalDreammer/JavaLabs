package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab06.model.logic;
public class RectangleMath {
    public static double CalculatePerimeter(double x1, double y1, double x2, double y2){
        double firstSide = x2 > x1? x2 - x1: x1 - x2;
        double secondSide = y2 > y1? y2 - y1: y1 - y2;
        double perimeter = firstSide*2 + secondSide*2;
        return perimeter;
    }

    public static double CalculateArea(double x1, double y1, double x2, double y2){
        double firstSide = x2 > x1? x2 - x1: x1 - x2;
        double secondSide = y2 > y1? y2 - y1: y1 - y2;
        double area = firstSide * secondSide;
        return  area;
    }
}
