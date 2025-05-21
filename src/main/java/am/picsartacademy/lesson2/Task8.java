package am.picsartacademy.lesson2;

public class Task8 { //triangle of *
    public static void main(String[] args) {
        int N = 5;
        for(int i =1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
