package org.example.HomeWork.Lesson19;

public class ShowArrayClass {
    public static void showArray(String[][] arr){
        System.out.print("{ ");
        for(int i = 0; i < arr.length;i++){
            System.out.print("{ ");
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " ");
            }
            if(i != arr.length - 1) {
                System.out.print(" }, ");
            } else {System.out.print(" } ");}
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String[][] arr = { {"pri", "hor", "gol"}, {"hi", "ru", "mi", "to"}, {"1", "2", "3", "4","5"}, {"asdf"}};
        showArray(arr);
    }
}
