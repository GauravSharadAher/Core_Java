package Multithreading;

public class MyThread extends Factorial implements  Runnable {
    private MyClass obj;

    private int num;

    public MyThread(int num){
        super(num);
    }
    public MyThread(MyClass obj, int num) {
        super(num);
        this.obj = obj;
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println( "factorial "+super.fact(num));
        obj.mul(num);

    }
}
