package org.example.Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    FileInputStream fis1, fis2;

    public void abc() {


        try {
            fis1 = new FileInputStream("test10.txt");
            try {
                fis2 = new FileInputStream("test11.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File 11 ne nayden");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File 10 ne nayden");
        }
        finally {
            System.out.println("Eto vneshiny finally block");
            try {
                fis1.close();
                fis2.close();
            }
            catch (IOException e){
                System.out.println("Naydeno iskluchenie v finally blocke ");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Test7 t = new Test7();
        t.abc();
    }
}
