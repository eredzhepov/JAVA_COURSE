package org.example.Lesson27;

import java.io.IOException;

public class Test10 {
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        } catch (IOException e){
            System.out.println("Exception poyaman " + e);
        }

    }
}
class Animal2{
    void run()  throws IOException, ArrayIndexOutOfBoundsException {
        System.out.println("Animal runs");
    }
    void run(int a) throws Exception{
        System.out.println("Animal runs");
    }
}
class Mouse extends Animal2{
    void run()  throws ArrayIndexOutOfBoundsException, NullPointerException{
        System.out.println("Mouse run");
    }
}
