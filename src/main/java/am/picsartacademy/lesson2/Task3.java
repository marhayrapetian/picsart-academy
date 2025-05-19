package am.picsartacademy.lesson2;

public class Task3 { //Create an array and fill it with odd numbers from -20:20
    public static void main(String[] args) {
        int oddNumbersCount = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                oddNumbersCount++;
            }
        }

        int[] oddNumbersArray = new int[oddNumbersCount];
        int k = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                oddNumbersArray[k] = i;
                k++;
            }
        }

        for (int i = 0; i < oddNumbersArray.length; i++) {
            System.out.print(oddNumbersArray[i] + " ");
        }
    }
}