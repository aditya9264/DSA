import java.util.*;
public class Switchdaysamongdays {
    public static void main(String[] args) {
        int dayofweek = 3;

        String dayName ;
        switch (dayofweek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
               dayName = "Tuesday";
               break;
            case 3:
            dayName = "Wednesday";
            break;
            case 4: 
            dayName = "Thrusday";
            break;
            case 5:
            dayName = "Friday";
            break;
            case 6:
            dayName = "saturday";
            break;
            case 7:
            dayName = "sunday";
            break;
            default:
                dayName = "Invalid Name";
        } 

        System.out.println(dayName);
    }
}
