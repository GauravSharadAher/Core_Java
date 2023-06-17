package Multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringRead {
    public boolean search(String f,String name) {
        try(BufferedReader bis= new BufferedReader(new FileReader(f));)
        {
            String str=null;
            do{
                str=bis.readLine();
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                if(name.equals(str)){
                    return true;
                }
            }while(str!=null);


        }catch( IOException e){

        }
        return false;
    }

}
