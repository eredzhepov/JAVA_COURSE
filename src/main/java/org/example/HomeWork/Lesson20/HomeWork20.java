package org.example.HomeWork.Lesson20;

public class HomeWork20 {
    public static String[] abc(String[] ... s){
        int length = 0;
        for(String[] a : s){
            length+= s.length;
        }

        String[] array = new String[length];
        int count = 0;
        for(String [] arr: s){
            for(String a : arr){
                array[count] = a;
                count++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        String[] target = abc(new String[] {"privet","poka", "ok"}, new String[] {"hi","go", "run"});
    for(String s : args){
        for (int i = 0; i < target.length; i++){
            if (s.equals(target[i])){
                target[i] = null;
            }
        }
        for (String str : target){
            System.out.print(str + " ");
        }
        System.out.println();
    }

    }
}
