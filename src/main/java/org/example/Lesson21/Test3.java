package org.example.Lesson21;

import org.example.HomeWork.lesson10.p1.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        String s1 =  "A";
        String s2 =  "B";
        String s3 =  "C";
        String s4 =  "D";
        ArrayList <String> list1 = new ArrayList<>();

        list1.add(s3);
        list1.add(s4);
        list1.add(s1);
        list1.add(s2);
        ArrayList <String> list2 = list1;
        ArrayList <String> list3 = new ArrayList<>();

        list3.add(s4);
        list3.add(s1);
        list3.add(s2);
        list3.add(s3);
        System.out.println(list1.equals(list3));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
