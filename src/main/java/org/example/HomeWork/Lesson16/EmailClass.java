package org.example.HomeWork.Lesson16;

public class EmailClass {
    public static void showEmail(String email){
        for(int i = 0; i < email.length(); i++){
            char c = email.charAt(i);
            char point = '.';
            if(c == '@'){
                System.out.println(email.substring(i+1, email.indexOf(point,i)));
            }
        }
    }

    public static void main(String[] args) {
        showEmail("ya@yahao.com; on@mail.ru; ona@gmail.com");
    }
}
