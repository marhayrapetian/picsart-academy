package am.picsartacademy.tread2;

public class MyCustomThread extends Thread {
    public String name;

    public MyCustomThread(String name) {
        this.name = name;


    }
    public void run(){
        test.counter(name);

    }

}
