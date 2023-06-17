package Multithreading.ProducerConsumerProblem;

public class TestThread {
    public static void main(String[] args) {
        Mystorage ms= new Mystorage();
        MyProducer p= new MyProducer(ms);
        MyConsumer c = new MyConsumer(ms);
        p.start();;
        c.start();
    }
}
