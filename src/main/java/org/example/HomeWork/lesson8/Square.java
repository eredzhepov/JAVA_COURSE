package org.example.HomeWork.lesson8;

public class Square {
    public  static final double PI = 3.14;

    public double circleSquare(int r){
        return r*r*PI;
    }
    public static double cirleLengh(int r){
        return  2*PI*r;
    }
    public void showInfo(int r){
        System.out.println("Радиус круга равен " + r + " его площадь равна " + circleSquare(r) + " и длинна окружности равна " + cirleLengh(r));
    }

}
class SquareTest{
    public static void main(String[] args) {
        Square cirle = new Square();
        System.out.println(cirle.circleSquare(5));
        System.out.println(Square.cirleLengh(3));
        cirle.showInfo(8);
    }
}
