package org.example.Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1= new FileInputStream("test10.txt");
            System.out.println("File text 10 sushestvuet i nayden");
            try{
                fis2.close();
            } catch (IOException e) {
                System.out.println("vishli problemi so strimom fis2");
            }
        } catch (FileNotFoundException e){
            System.out.println("File test10 ne nayden");
        } catch (NullPointerException e2){
            System.out.println("srabotal NullPointerException");
        }
    }
}
