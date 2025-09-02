package am.picsartacademy.treads;

public class test11 {
    public static void main(String[] args) throws InterruptedException{
       MyCustomThread myCustomThread1 = new MyCustomThread("thread1");
       MyCustomThread myCustomThread2 = new MyCustomThread("thread2");
       MyCustomThread myCustomThread3 = new MyCustomThread("thread3");
       MyCustomThread myCustomThread4 = new MyCustomThread("thread4");


        System.out.println(myCustomThread1.getPriority()+ "Priority");

       myCustomThread1.start();
       myCustomThread2.start();
       myCustomThread3.start();
       myCustomThread4.start();

       myCustomThread1.join();
        System.out.println("lolololo");


    }
}
