package Multithreading;

public class Factorial
{
    private int num;
    private  int fact;
    public Factorial(int num) {
        this.num = num;
    }

    public Factorial() {
    }

    public int fact(int num) {
        int fact = 1;
        synchronized (this) {
            while (num > 0) {
                fact = fact * num;
                num--;
            }
            return fact;
        }

    }

}
