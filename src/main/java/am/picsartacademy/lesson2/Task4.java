package am.picsartacademy.lesson2;

public class Task4 { //Create an array and fill it. Print all elements which can be divided by 5.
    public static void main(String[] args) {
        int[] Array = {8, 10, 12, 32, 40, 45, 54, 78, 95};
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 5 == 0) {
                System.out.println(Array[i]);
            }
        }
    }
}
