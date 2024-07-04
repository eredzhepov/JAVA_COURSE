package org.example.Lesson16;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало, " +
                "Два важных правила запомни для начала: Ты лучше голодай, " +
                "чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();

        for(int i = 0; i < s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != ',' && c1 != ' ' && c1 != ':' && c1 != '.' && c1 == c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
    }
}
