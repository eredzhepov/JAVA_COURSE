package org.example.Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        System.out.println(s1.length()); // отсчето о 1

        char c1 = s1.charAt(3); // отсчет от 0
        System.out.println(c1);

        int i = s1.indexOf('t');
        System.out.println(i);
        int i2 = s1.indexOf("et");
        System.out.println(i2);

        int i3 = s1.indexOf("ZZ");
        System.out.println(i3);

        int i4 = s1.indexOf('a',2);
        System.out.println(i4);

        boolean b1 = s1.startsWith("ga",6);
        System.out.println(b1);


    }
}
