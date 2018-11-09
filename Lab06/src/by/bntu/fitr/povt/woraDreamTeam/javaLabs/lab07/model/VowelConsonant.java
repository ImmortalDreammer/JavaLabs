package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model;

public class VowelConsonant {
    public static String TypeOfLetterFirst(char letter){
        if(letter == 'a' || letter == 'A'){
            return "A letter is vowel";
        } else if(letter == 'e'|| letter =='E'){
            return "A letter is vowel";
        } else if (letter == 'u'||letter =='U'){
            return "A letter is vowel";
        } else if (letter == 'i'||letter =='I'){
            return "A letter is vowel";
        } else if(letter == 'o'|| letter == 'O'){
            return "A letter is vowel";
        }else {
            return "A letter is consonant";
        }
    }

    public static String TypeOfLetterSecond(char letter){
        switch (letter){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'u':
            case 'U':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
                return "A letter is vowel";
            default:
                return "A letter is consonant";
        }
    }

    public static String TypeOfLetterThird(char letter){
        char[] chars = {'a','A','e','E','u','U','i','I','o','O'};
        String s = " ";
        for (char ch: chars){
            if(letter == ch){
                s =  "A letter is vowel";
                break;
            } else{
                s = "A letter is consonant";
            }
        }
        return s;
    }

    public static String TypeOfLetterFourth(char letter){
        String s;
        s = letter == 'a'||letter == 'A'||letter == 'e'|| letter == 'E'||letter =='u'||letter == 'U'|| letter =='i' ||
                letter == 'I'|| letter == 'o'|| letter == 'O'?"A letter is vowel":"a letter is consonant";
        return s;
    }
}
