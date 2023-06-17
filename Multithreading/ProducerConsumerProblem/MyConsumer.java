package Multithreading.ProducerConsumerProblem;

public class MyConsumer  extends Thread{
    private Mystorage ms;

    public MyConsumer(Mystorage ms) {
        this.ms = ms;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            ms.getN();
        }
    }
}
