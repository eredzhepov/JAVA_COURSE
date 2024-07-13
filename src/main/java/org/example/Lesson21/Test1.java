package org.example.Lesson21;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add(1,"hello");
        list.add("hello");
        list.add("hello");
        list.add(6,"hello");
        list.set(1, "!!!");
        for(String s : list){
            System.out.print( s + " ");
        }
        boolean b = list.remove("ok");
        //list.remove("ok");
        System.out.println(b);
        for(String s : list){

            System.out.print( s + " ");
        }
        StringBuilder sb1 = new StringBuilder("1");
        StringBuilder sb2 = new StringBuilder("1");
        System.out.println();
        System.out.println(sb1.equals(sb2));
    }

}
