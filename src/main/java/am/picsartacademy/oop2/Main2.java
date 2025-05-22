package am.picsartacademy.oop2;

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Tesla", 4);

        System.out.println(car3.brandName);
        System.out.println(car3.numberOfDoors);
        System.out.println(car2.brandName);


    }
}
