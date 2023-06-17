package Multithreading.Callable;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {
    private int start,end;

    public MyTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int sum=0;
        System.out.println(start + "-->" + end +"-->" + Thread.currentThread().getId());
        for (int i = start; i <=end ; i++) {
            sum+=i;
        }
        return  sum;
    }
}
