package ExceptionHandling;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
            try{
                int ans=acceptdata();
                System.out.println();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    public static int acceptdata() throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if((age <18) || (age>60)){
            throw new Exception ("Mahajan is legend");
        }
        return age;
    }
}
