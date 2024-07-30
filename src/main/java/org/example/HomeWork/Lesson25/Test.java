package org.example.HomeWork.Lesson25;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("a1");
        Animal a2 = new Lev("a2");
        Animal a3 = new Pingvin("a3");
        Mammal m1 = new Lev("m1");
        Fish f1 = new Mechenosec("f1");
        Bird b1 = new Pingvin("b1");
        Mechenosec mec1 = new Mechenosec("mec1");
        Lev l1 = new Lev("l1");
        Pingvin p1 = new Pingvin("p1");
        Speakeable s1 = new Pingvin("s1");
        Speakeable s2 = new Lev("s2");
        Speakeable[] array1 = {m1, b1, l1, p1, s1, s2};
        Animal[] array2 = {a1,a2,a3,m1,f1,b1,mec1,l1,p1};

        for (Speakeable s : array1) {
            if( s instanceof Lev){
                System.out.println(((Lev) s).name);
                ((Lev) s).eat();
                ((Lev) s).run();
                ((Lev) s).sleep();
                s.speack();
            }else if (s instanceof Pingvin){
                System.out.println(((Pingvin) s).name);
                ((Pingvin) s).sleep();
                ((Pingvin) s).fly();
                ((Pingvin) s).eat();
                s.speack();
            } else if (s instanceof Mechenosec){
                System.out.println(((Mechenosec) s).name);
                ((Mechenosec) s).sleep();
                ((Mechenosec) s).swim();
                ((Mechenosec) s).eat();
                s.speack();
            }
        }
        System.out.println("----------------------");
        for (Animal a : array2){
            if(a instanceof Lev){
                System.out.println(a.name);
                a.eat();
                a.sleep();
                ((Lev) a).run();
                ((Lev) a).speack();
            }
        }
        for(Animal a : array2){
            if(a instanceof Pingvin){
                ((Pingvin) a).speack();
                a.sleep();
                a.eat();
                ((Pingvin) a).fly();
            }

        }
        for(Animal a : array2){
            if(a instanceof Mechenosec) {
                a.eat();
                a.sleep();
                ((Mechenosec) a).swim();
            }
        }
    }
}
