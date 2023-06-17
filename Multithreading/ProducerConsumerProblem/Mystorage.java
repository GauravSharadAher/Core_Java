package Multithreading.ProducerConsumerProblem;

public class Mystorage {
    private int n;
    private boolean flag;

    public Mystorage() {
    }

    public Mystorage(int n, boolean flag) {
        this.n = n;
        this.flag = false;
    }

   synchronized public void setN(int n){
        // here for producer logic
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("set " + n);
        flag=true;
        notify();
    }
    synchronized public void getN(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("get "+ n);
        flag=false;
        notify();
    }
}
