package am.picsartacademy.homework4;
//Task 1:
//Create a class Box<T> that stores one item of any type.
// Add setItem(T item) and T getItem() methods.

public class Box<T> {
    private T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
    public static void main(String[] args) {

        Box<String> nameBox = new Box<>();
        nameBox.set("aaa");
        System.out.println("Name: " + nameBox.get());
        Box<Integer> ageBox = new Box<>();
        ageBox.set(33);
        System.out.println("Age: " + ageBox.get());
        Box<Boolean> statusBox = new Box<>();
        statusBox.set(true);
        System.out.println("Student: " + statusBox.get());

    }
}
