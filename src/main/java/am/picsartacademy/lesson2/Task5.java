package am.picsartacademy.lesson2;

public class Task5 { //Create an array and fill it. Print all elements which are between 24.12 and 467.23.
    public static void main(String[] args) {
        double[] Array = {14.3, 23.11, 31.23, 76.65, 120.1, 777.12, 470.11, 500.35};
        for (double number : Array) {
            if (number >= 24.12 && number <= 467.23) {
                System.out.print(number + " ");
            }
        }
    }
}
