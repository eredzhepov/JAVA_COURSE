package org.example.HomeWork.Lesson23.Test1.p2;

import org.example.HomeWork.Lesson23.Test1.p1.*;

public class Y extends X {
    Y(){};
    public void abc(){
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
