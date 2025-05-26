package am.picsartacademy.oop3;

public class Main {
    public static void main(String[] args) {
        Electronics smartphone = new Electronics("Phone", 799.99);
        Clothing jeans = new Clothing("Jeans", 49.99);
        Book javaBook = new Book("Java for Beginners", 19.99);

        smartphone.purchase();
        jeans.purchase();
        javaBook.purchase();
    }
}
