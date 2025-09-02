package am.picsartacademy.lesson15;

public class test12 {
    public static <T> void print(T... elements) {

        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        print(10, 9, 8, 7, 6);
        print("aa", "bb", "cc");
        print(2.3, 4.3, 8.9);

    }


}

