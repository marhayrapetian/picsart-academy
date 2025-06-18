package am.picsartacademy.homework3;

public abstract class Sportsman {
    private final Category category;

    public Sportsman(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public abstract void play();
}

