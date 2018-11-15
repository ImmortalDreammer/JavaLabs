/** This program calculates different tasks depend on your choice
 * lab07 LifeCalculator
 * version 1.0
 * developer: Tolstikova Anastasia Eduardovna, Kuzmich Ekaterina Denisovna
 * brigade: WORA dream team
 * group: 10701117
 * date: 07.11.2018
 */

package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.controller;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model.*;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.view.Printer;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.util.UserInput;

public class Lab07 {
    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        boolean loop = true;
        while(loop){
            int ch = (int)UserInput.inputDouble("Please enter a num: 1 - max number, 2 - vowel or consonant," +
                    " 3 - dice, 4 - dragon, 5 - your mood, 6 - next day, 7 - exit");
            if (ch > 7){
                Printer.print("You entered a wrong number. Please try again :) ");
            }
            switch (ch){
                case 1:
                    double a = UserInput.inputDouble("Input a ");
                    double b = UserInput.inputDouble("Input b ");
                    double c = UserInput.inputDouble("Input c ");
                    Printer.print("a = " + a + " b = " + b + " c = " + c);
                    double max = TheGreatest.greatest(a,b,c);
                    Printer.print("The greatest number is " + max);
                    break;

                case 2:
                    char letter = UserInput.inputChar("Input a letter ");
                    String result;
                    //result = VowelConsonant.TypeOfLetterFirst(letter);
                    //result = VowelConsonant.TypeOfLetterSecond(letter);
                    //result = VowelConsonant.TypeOfLetterThird(letter);
                    result = VowelConsonant.TypeOfLetterFourth(letter);
                    Printer.print(result);
                    break;

                case 3:
                    int res;
                    res = Dice.DiceSum();
                    System.out.println("Sum of points of two dice = " + res);
                    break;

                case 4:
                    int N = UserInput.inputInt("\nEnter age of dragon: ");
                    Dragon.Heads(N);
                    break;
                case 5:
                    Printer.print("Today your mood is: ");
                    Mood.Moood();
                    break;
                case 6:
                    int day = UserInput.inputInt("Input a day");
                    int month = UserInput.inputInt("Input a month");
                    int year = UserInput.inputInt("Input a year");
                    Printer.print("date:" + day + '.' + month + '.' + year);
                    String nextDay = NextDay.grigorianCalendar(day,month,year);
                    Printer.print("Next day is " + nextDay);
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}
