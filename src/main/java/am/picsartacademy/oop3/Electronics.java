package am.picsartacademy.oop3;

public class Electronics extends Product{
    public Electronics(String name, double price) {
        super(name, price);
    }
    public void purchase() {
        System.out.println("Buying Electronics: " + getName() + " with a guarantee.");
    }
}
