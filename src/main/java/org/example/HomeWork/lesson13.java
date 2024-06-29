package org.example.HomeWork;

public class lesson13 {
}
class Month{
    public static void month(int day){
        switch (day){
            case 1,3,5,7,8,10,12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4,6,9,11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        month(5);

    }
}
