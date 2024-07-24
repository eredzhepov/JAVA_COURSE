package org.example.Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura pram = new Pryamougolnik();
        pram.perimetr();
        pram.ploshad();
        System.out.println(pram.kolichesvoStoron);
    }
}
abstract class Figura{
  abstract void ploshad();
  abstract void  perimetr();
  int kolichesvoStoron = 0;
}
class Pryamougolnik extends Figura{
    int kolichesvoStoron = 4;
    int storona1 = 8;
    int storona2 = 3;
    public void ploshad(){
        System.out.println("Ploshad pryamougonika = " + storona1*storona2);
    }
    public void perimetr(){
        System.out.println("Perimetr pryamougonika = " + 2*(storona1+storona2));
    }

}
