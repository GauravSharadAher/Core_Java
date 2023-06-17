package Multithreading.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallMain {
    public static void main(String[] args) {
        // this creates the pool for thread
        ExecutorService es = Executors.newFixedThreadPool(5);
        List<Future> flist= new ArrayList<Future>();
        for (int i = 1; i <=91 ; i=i+10) {
            MyTask t= new MyTask(i,i+9);
            Future f= es.submit(t);
            flist.add(f);
        }
        int sum=0;
        for (Future f:flist)
        {
            try {
                // typcasting to int
                sum=sum + (int)f.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" Sum " + sum);
        try {
            es.awaitTermination(500, TimeUnit.MILLISECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
