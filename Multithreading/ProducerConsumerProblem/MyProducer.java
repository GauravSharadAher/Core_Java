package Multithreading.ProducerConsumerProblem;

public class MyProducer extends  Thread {
    private Mystorage ms;

    public MyProducer(Mystorage ms) {
        this.ms = ms;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            ms.setN(i);
        }
    }
}
