package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model;
import by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.view.Printer;

public class Dragon {
    public static void Heads(int N) {
        int kolheads = 3;
        int heads = 0;
        int eyes = 0;

        if (N < 200) {
            heads = N * 3 + kolheads;
            eyes = heads * 2;
        } else if (N < 300) {
            heads = ((N - 200) * 2) + kolheads + (200 * 3);
            eyes = heads * 2;
        } else {
            heads = (((N - 200) * 2) - ((N - 300))) + kolheads + (200 * 3);
            eyes = heads * 2;
        }
        Printer.print("Amount of heads of dragon: " + heads);
        Printer.print("Amount of eyes of dragon: " + eyes);
    }
}

