package org.example.HomeWork.Lesson20;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] arr = {sb1,sb2,sb3};

        for(StringBuilder sb : arr){
            sb.append(" Java");
        }
        int[] arr2  = {1,4,7,2};
        for(int i : arr2){
            i=3;
        }

        for(int i = 0; i < arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
