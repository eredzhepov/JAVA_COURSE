package org.example.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test4 {
    void abc() throws FileNotFoundException{
        File f = new File("test11.txt");
//        try{
            FileInputStream fis = new FileInputStream(f);

            FileOutputStream fos = new FileOutputStream(f);
            System.out.println("Block in a try");
//        }
//        catch(FileNotFoundException e){
//            System.out.println("Bil poyamn exeption: " + e);
//        }
    }
    void def(){
        System.out.println("privet");
        try{
            abc();
        }
        catch (FileNotFoundException e){
            System.out.println("Bil poyamn exeption: " + e);
        }

    }
    public static void main(String[] args) {
        File f = new File("test11.txt");
        try{
            FileInputStream fis = new FileInputStream(f);

            FileOutputStream fos = new FileOutputStream(f);
            System.out.println("Block in a try");
        }
        catch(FileNotFoundException e){
            System.out.println("Bil poyamn exeption: " + e);
        }
        finally {
            System.out.println("Этот блок точно выполнится");
        }

    }
}
