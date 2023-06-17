package Multithreading;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        StringRead s= new StringRead();
        Thread [] th = new Thread[5];
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string");
            String n=sc.next();
            th[i]= new StringThread(s,n);

        }
        for (int i = 0; i < 5; i++) {
            th[i].start();
        }
        for (int i = 0; i < 5; i++) {
            try {
                th[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
