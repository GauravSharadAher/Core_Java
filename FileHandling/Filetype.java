package FileHandling;

import java.io.*;

public class Filetype {
    public static void main(String[] args) {
        File f= new File("name.text");
        FileOutputStream fos=null;
        try{
            if(f.exists()){
             fos = new FileOutputStream("xyz.text");
        }else{
             fos = new FileOutputStream("xyz.text");
        }
        } catch (IOException e) {
           e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("name.txt");
            FileOutputStream fos1=fos;
            int i= fis.read();
            while(i!=-1){
                fos1.write(i);
                i= fis.read();
            }
        } catch (IOException e) {
            System.out.println("ENDED");
        }
    }
}
