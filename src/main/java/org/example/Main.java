package org.example;

public class Main {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0xC;
        byte b4 = 014;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0b10100010100;
        short s3 = 0x514;
        short s4 = 02424;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0x0;
        int i4 = 00;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
        long l2 = 0b111010110111100110100010101L;
        long l3 = 0x75bcd15L;
        long l4 = 0726746425L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = 34.55f;
        float f2 = 2342.234234f;
        double d1 = 234234.4324234;
        double d2 = 3.3d;
        boolean t = true;
        boolean f = false;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(t);
        System.out.println(f);

        char c1 = 1000;
        char c2 = 'Ϩ';
        char c3 = '\u03e8';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}