package am.picsartacademy.oop3;

public class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
    public void purchase() {
        System.out.println("Buying a book: " + getName() + ". Download started.");
    }
}
