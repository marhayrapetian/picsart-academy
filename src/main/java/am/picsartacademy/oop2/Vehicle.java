package am.picsartacademy.oop2;

public class Vehicle {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void drive() {
        System.out.println("Driving a vehicle...");
    }
}
