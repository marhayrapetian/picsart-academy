package am.picsartacademy.homework3;

public class BasketballPlayer extends Sportsman {

    public BasketballPlayer(Category category) {
        super(category);
    }

    @Override
    public void play() {
        System.out.print("I am playing basketball ");
        if (getCategory() == Category.SINGLE) {
            System.out.println("alone");
        } else {
            System.out.println("with my team");
        }
    }
}
