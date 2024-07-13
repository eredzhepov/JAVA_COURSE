package org.example.Lesson19;

public class Test6 {
    public static void maxMin(double[] arr){
        double dMax = arr[0];
        double dMin = arr[0];
        for(int i=0; i< arr.length;i++){
            if (arr[i] > dMax){
                dMax = arr[i];
            }
            if (arr[i] < dMin){
                dMin = arr[i];
            }
        }
        System.out.println("Min = " + dMin);
        System.out.println("Max = " + dMax);
    }

    public static void main(String[] args) {
        double[] arr1 = {1.3, 42.23, -9.5, -3.2, 5.2};
        maxMin(new double[]{5,23,23.3,765.4});
    }
}
