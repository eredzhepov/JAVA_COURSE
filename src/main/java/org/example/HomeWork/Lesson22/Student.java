package org.example.HomeWork.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public void setCourse(int course) {
        if (course >= 1 & course <=4) this.course = course;
    }

    public void setGrade(int grade) {
        if (grade >= 1 & grade <=10) this.grade = grade;
    }

    public StringBuilder getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }
    public void showInfo(){
        System.out.println("Студент : " + getName() + " обучающийся на " + getCourse() + " курсе, имеет оценку " + getGrade());
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Murat"));
        s.setCourse(4);
        s.setGrade(8);
        s.showInfo();
    }
}
