package am.picsartacademy.treads;

public class MyCustomThread extends Thread {
    private String name;
    public  MyCustomThread(String name) {
        this.name = name;

    }
    public void run(){

        System.out.println("Print this run " + name);


    }


}
