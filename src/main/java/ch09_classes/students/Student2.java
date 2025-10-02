package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    // default로 생성됐을 때는 안내문구를 쓸 수 없다.
    // "기본생성자로 객체를 생성했다."

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }
    public Student2(int studentCode, String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }
    public Student2(int studentCode, String name, double score) {
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

}
