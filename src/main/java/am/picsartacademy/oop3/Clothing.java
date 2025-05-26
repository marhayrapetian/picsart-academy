package am.picsartacademy.oop3;

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
    public void purchase() {
        System.out.println("Buying clothes: " + getName() + "Returns are possible within 14 days.");
    }

}
