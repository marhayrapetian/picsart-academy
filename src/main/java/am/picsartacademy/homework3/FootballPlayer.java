package am.picsartacademy.homework3;


public class FootballPlayer extends Sportsman {

    public FootballPlayer(Category category) {
        super(category);
    }

    @Override
    public void play() {
        System.out.print("I am playing football ");
        if (getCategory() == Category.SINGLE) {
            System.out.println("alone");
        } else {
            System.out.println("with my team");
        }
    }
}