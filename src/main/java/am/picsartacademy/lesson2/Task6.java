package am.picsartacademy.lesson2;

public class Task6 { //Create an array and fill it. Print count of elements which can be divided by 2.
    public static void main(String[] args) {
        int[] Array = {1, 3, 4, 6, 5, 7, 8, 10, 12, 13, 22, 43, 56, 76, 85};
        int count = 0;
        for(int i = 0; i< Array.length; i++){
            if (Array[i]% 2 ==0 ){
                count++;
            }
        }
        System.out.println(count);
    }
}
