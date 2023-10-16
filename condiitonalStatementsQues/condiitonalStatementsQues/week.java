import java.util.*;
public class week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int dayNumber = sc.nextInt();
        String dayName = getDayOfWeek(dayNumber);

        if (dayName != null) {
            System.out.println("The corresponding day of the week is: " + dayName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        sc.close();
    }
    
    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return null;
        }
    }
}