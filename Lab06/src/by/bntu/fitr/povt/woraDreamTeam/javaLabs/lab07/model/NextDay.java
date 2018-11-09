package by.bntu.fitr.povt.woraDreamTeam.javaLabs.lab07.model;

public class NextDay {
    public static String grigorianCalendar(int day ,int month, int year){
        int nextDay = day, nextMonth = month, nextYear = year;
        String result;
        if(month == 2 & year % 4 == 0){
            if(day == 28 & (year % 100 != 0 | year % 400 == 0)){
                nextDay = day + 1;
            } else if ((year % 100 == 0 & day == 28) | day == 29) {
                nextDay = 1;
                nextMonth = month + 1;
            } else{
                nextDay = day + 1;
            }
        } else if(month == 2 & day == 28){
            nextDay =1;
            nextMonth = month + 1;
        } else if (day < 31){
            nextDay = day + 1;
        } else {
               if(month == 12){
                   nextDay = 1;
                   nextMonth = 1;
                   nextYear = year + 1;
               } else{
                   nextDay = 1;
                   nextMonth = month + 1;
               }
        }
        result = String.valueOf(nextDay) + '.' + String.valueOf(nextMonth) + '.' + String.valueOf(nextYear);
        return result;
    }
}
