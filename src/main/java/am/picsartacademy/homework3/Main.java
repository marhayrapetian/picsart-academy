package am.picsartacademy.homework3;

public class Main {
    public static void main(String[] args) {
        Sportsman footballPlayer = new FootballPlayer(Category.TEAM);
        Sportsman tennisPlayer = new TennisPlayer(Category.SINGLE);
        Sportsman basketballPlayer = new BasketballPlayer(Category.TEAM);

        footballPlayer.play();
        tennisPlayer.play();
        basketballPlayer.play();
    }
}