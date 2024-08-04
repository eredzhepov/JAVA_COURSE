package org.example.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test10.txt");
            System.out.println("File sozdan");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Sozdan strim");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("INformaciya chitayetsa");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("Eto finaly");
        }
    }
}
