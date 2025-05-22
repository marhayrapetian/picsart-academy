package am.picsartacademy.oop2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Bike();

        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();

       Car vehicle4 = new ElectricCar();

       vehicle4.drive();

    }
}
