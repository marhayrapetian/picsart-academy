package am.picsartacademy.tread2;

public class test {
    public static void main(String[] args) {
        MyCustomThread myCustomThread1 = new MyCustomThread("---");
        MyCustomThread myCustomThread2 = new MyCustomThread("+++");

        myCustomThread1.start();
        myCustomThread2.start();

    }

    public synchronized static void counter(String name) {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Counter for " + name + " " + i);
        }

    }


}
