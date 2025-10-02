package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 59점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D 입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
        String grade = "";

        if (score >= 90 ) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 59) {
            grade = "F";
        } else if (score < 0 ) {
            grade = "X";
        } else {
            System.out.println("점수를 다시 입력하세요 : ");
        }
        System.out.println("학생의 점수 : "+score +" 학생의 학점 : "+ grade +"입니다. ");


    }
}
