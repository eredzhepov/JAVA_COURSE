package org.example.HomeWork.Lesson17;

public class StringBuilderHomeWork {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                char c1 = sb1.charAt(i);
                char c2 = sb2.charAt(i);
                if (c1 != c2) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OdiNakoviE    SB Znacheniya!!   ");
        StringBuilder sb2 = new StringBuilder("OdiNakoviE    SB Znacheniya!!   ");
        System.out.println(ravenstvo(sb1, sb2));
    }
}
