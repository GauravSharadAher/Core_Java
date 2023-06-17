package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Autoclosable {
    public static void main(String[] args) {
        try(FileInputStream fis =new FileInputStream("name.txt");
        FileOutputStream fos = new FileOutputStream("ans.txt");){
            int i= fis.read();
            while(i!=-1){
                fos.write(i);
                i= fis.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
