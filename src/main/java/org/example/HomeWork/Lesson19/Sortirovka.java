package org.example.HomeWork.Lesson19;

public class Sortirovka {
    public static void sortirovka(int[] arr){
        OUT:
        for(int i=0; i < arr.length; i++){
            IN:
            for(int j = 0; j < arr.length - 1; j++){

                if(arr[j] > arr[j+1]){
                    int c = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = c;
                }
            }
        }
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,-1,2,5,21,45,5,36,54,-5,34,5,-33,53,6};
        sortirovka(arr);
    }
}
