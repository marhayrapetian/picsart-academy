package am.picsartacademy.lesson2;
import java.util.Scanner;

public class Task7 { // Given an integer, 0< N < 21 , print its
    //first 10 multiples. Each multiple  N x i (where 0<i<11)
    //should be printed on a new line in the form: N x i = result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N > 0 && N < 21) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        } else {
            System.out.println("N must be between 1 and 20.");
        }

        scanner.close();
    }
}