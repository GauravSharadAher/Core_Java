package Multithreading;

public class Main {
    public static void main(String[] args) {
        MyClass m= new MyClass();
        MyThread th1= new MyThread(m,5);
        MyThread th2 = new MyThread(m,7);
        MyThread th= new MyThread(m,5);
        System.out.println("Main start pt");
        Thread t = new Thread(th1);
        Thread t1 = new Thread(th2);
        Thread th3 =new Thread(th);
        t.start();
        t1.start();
        th3.start();
        try {
            t.join();
            t1.join();
            th3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main ends");
    }
}
