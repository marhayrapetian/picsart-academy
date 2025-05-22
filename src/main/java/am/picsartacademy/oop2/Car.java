package am.picsartacademy.oop2;

public class Car extends Vehicle {
    String brandName;
    int numberOfDoors;

    public Car(String brandName) {
        this.brandName = brandName;

    }
    public Car(String brandName, int numberOfDoors) {
        this.brandName = brandName;
        this.numberOfDoors = numberOfDoors;
    }
    public Car(){

    }

    public void drive() {
        super.drive();
        System.out.println("Driving a car...");
    }
}
