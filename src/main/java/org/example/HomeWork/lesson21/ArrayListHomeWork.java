package org.example.HomeWork.lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomeWork {
    public ArrayList<String> abc(String ... n ){
        ArrayList <String> list = new ArrayList<>();

//        for (String s : n ){
//                list.add(s);
//        }
//        for(int i =0; i< list.size();i++){
//            for(int j = i+1; j < list.size(); j++){
//                if(list.get(i).contains(list.get(j)) ){
//                    list.remove(list.get(i));
//                }
//            } мой вариант
        for (String s : n ){
            if(!list.contains(s))
                list.add(s);
        }

        Collections.sort(list);
        return  list;
    }
    public static void main(String[] args) {
    ArrayListHomeWork cls = new ArrayListHomeWork();
        ArrayList<String> list= cls.abc("g","g", "m","c","m", "a", "a");
        System.out.println(list);
    }
}
