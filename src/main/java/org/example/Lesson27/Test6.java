package org.example.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
    static int abc(){
        try{
            File f = new File("test11.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;
        }
        catch (FileNotFoundException e){
            System.out.println("Exception poyamn");
            return 6;
        }
        finally {
            System.out.println("Eto finaly");
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
