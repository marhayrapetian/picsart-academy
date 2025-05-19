package am.picsartacademy.lesson2;

public class Task2 { //Create an array and fill it with numbers from 1:1000.
    public static void main(String[] args) {
        int[] Array = new int[1000];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = i + 1;
            System.out.println(Array[i]);
        }
    }
}
