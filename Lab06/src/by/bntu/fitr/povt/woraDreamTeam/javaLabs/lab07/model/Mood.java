package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model;
import java.util.Random;

public class Mood {
     public static int Moood(){
         Random rand = new Random();
         int a = rand.nextInt(6) + 1;
         if (a == 1) {
             System.out.println( "   ******\n" +" *       *\n" +"*   > <   *\n" +"*    =    *\n" +"  *     *\n" +"  ****** ");
         } else if (a == 2) {
             System.out.println( "   ******\n" +" *       *\n" +"*   _ _   *\n" +"*    _    *\n" +"  *     *\n" +"  ****** ");
         } else if (a == 3) {
             System.out.println( "   ******\n" +" *       *\n" +"*   ^ ^   *\n" +"*    ~    *\n" +"  *     *\n" +"  ****** ");
         } else if (a == 4) {
             System.out.println( "   ******\n" + " *       *\n" + "*   o o   *\n" + "*    X    *\n" + "  *     *\n" + "  ****** ");
         } else if (a == 5) {
             System.out.println( "   ******\n" +" *       *\n" +"*   ^ ^   *\n" +"*    U    *\n" +"  *     *\n" +"  ****** ");
         } else if (a == 6) {
             System.out.println( "   ******\n" +" *       *\n" +"*   U U   *\n" +"*    Q    *\n" +"  *     *\n" +"  ****** ");
         }
         return a;
     }
}

