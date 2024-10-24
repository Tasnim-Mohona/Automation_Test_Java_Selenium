package ControlStatements;

public class SwitchCase {
    public static void main(String[] args)
    {   int day = 3;
        String dayName;

        switch (day) {
            case 1:
            dayName = "Sunday";
            break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            default:
                dayName = "Invalid Day";
        }
        System.out.println("Day is: " + dayName);
    }
}
