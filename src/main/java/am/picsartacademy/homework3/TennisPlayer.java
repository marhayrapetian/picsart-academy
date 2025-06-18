package am.picsartacademy.homework3;

public class TennisPlayer extends Sportsman {

    public TennisPlayer(Category category) {
        super(category);
    }

    @Override
    public void play() {
        System.out.print("I am playing tennis ");
        if (getCategory() == Category.SINGLE) {
            System.out.println("alone");
        } else {
            System.out.println("with my team");
        }
    }
}
