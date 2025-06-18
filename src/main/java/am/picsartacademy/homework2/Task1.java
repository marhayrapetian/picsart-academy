package am.picsartacademy.homework2;
//  1.	Define a Simple Enum
//      Create an enum DayOfWeek with constants for each day (MONDAY to SUNDAY).
//  •	Task: Print a message based on the current day.

import java.util.Scanner;

public class Task1 {
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
        String input = sc.nextLine().toUpperCase();

        DayOfWeek currentDay = DayOfWeek.valueOf(input);

        System.out.println("today is " + currentDay);

        sc.close();

    }
}