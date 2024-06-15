package org.example.lesson5;

public class BankAccount {
    String name;
    int id;
    double schet;
    public void popolnenieScheta(double summaPopolneniya){
        schet = schet + summaPopolneniya;
    }
    public void snyatieScheta(double summaSnyatiya){
        schet = schet - summaSnyatiya;
    }
    public void showInfo(){
        System.out.println("На счету у " + name + " " + schet + " рублей");
    }

}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.id = 123;
        bA.name = "Ivan";
        bA.schet = 1243.23;
        bA.showInfo();
        bA.popolnenieScheta(400);
        bA.showInfo();
        bA.snyatieScheta(231);
        bA.showInfo();

    }
}
