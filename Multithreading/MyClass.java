package Multithreading;

public class MyClass {
    private int n;

    public MyClass(int n) {
        this.n = n;
    }

    public MyClass() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

     public void mul(int n){
         synchronized (this){ for (int i = 1; i <=10 ; i++) {
            System.out.println(n + " * " + i + " = "+(n*i));
        }
         }
    }




}
