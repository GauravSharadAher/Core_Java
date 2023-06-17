package FileHandling;

import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        try(BufferedInputStream bis= new BufferedInputStream(new FileInputStream("name.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("abc.txt"));){
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
