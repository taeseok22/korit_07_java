package ch10_getter_setter.univ_student;

import ch09_classes.students.Student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent1 = new UnivStudent();
        univStudent1.setName("김일");
        univStudent1.setGrade(1);
        univStudent1.setScore(3.3);

        UnivStudent univStudent2 = new UnivStudent("김이");
        univStudent2.setGrade(3);
        univStudent2.setScore(-30);
        univStudent2.setScore(4.0);

        UnivStudent univStudent3 = new UnivStudent(5);

        univStudent3.setName("김삼");
        univStudent3.setGrade(2);
        univStudent3.setScore(2.7);

        UnivStudent univStudent4 = new UnivStudent("김사", 4);
        univStudent4.setScore(3.8);

        UnivStudent univStudent5 = new UnivStudent("김오", 2, 1.0);


        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();



    }
}

