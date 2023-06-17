package Multithreading;

public class StringThread extends Thread{

    private StringRead obj;
    private String name;

    public StringThread(StringRead obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public void run(){
        boolean status= obj.search("Loni.txt",name);
        if(status){
            System.out.println("Found " + name);
        }else{
            System.out.println(" Not Found " + name);
        }
    }
}
