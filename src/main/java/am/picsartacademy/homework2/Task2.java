package am.picsartacademy.homework2;
//2.	Enum with Switch Case
//  Use the DayOfWeek enum in a switch statement to print whether the day is a weekday or weekend.

import java.util.Scanner;

public class Task2 {
    enum DayOfWeek {

        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the day of the week: ");
        String input = sc.nextLine().toLowerCase();

        DayOfWeek day = null;

        for (DayOfWeek d : DayOfWeek.values()) {
            if (d.name().equals(input)) {
                day = d;
                break;
            }
        }

        if (day == null) {
            System.out.println("Invalid day entered.");
        } else {
            switch (day) {
                case saturday:
                case sunday:
                    System.out.println(day + " is a weekend.");
                    break;
                default:
                    System.out.println(day + " is a weekday.");
                    break;
            }
        }

        sc.close();
    }
}