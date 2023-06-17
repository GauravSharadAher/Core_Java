package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
             fis =new FileInputStream("name.txt");
             fos = new FileOutputStream("ans.txt");
            int i=fis.read();
            while(i!=-1){
                fos.write(i);
                i= fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
            fis.close();
            fos.close();
            }catch(IOException e){
                System.out.println("terminated");
            }
        }
    }
}
