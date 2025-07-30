package ch06_condition;

import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condition05의 코드는
    100초과 / 0미만의 점수가 입력됐을 때 각각 A / F라는 결과값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고 안내를 하려면
    어떻게 할 수 있을까요?
    100 초과 / 0 미만의 경우 grade 를 X 라고 하겠습니다.

    참고 사항 : 선수학습 하신 분들 중첩 if 문을 사용하지 않고 작성하겠습니다.
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();

        String grade = "";
//        if (score >= 90) {
//            grade = "A";
//        } else if (score >= 80) {
//            grade = "B";
//        } else if (score >= 70) {
//            grade = "C";
//        } else if (score >= 60) {
//            grade = "D";
//        } else if (score <= 59) {
//            grade = "F";
//        } else if (score < 0 || score > 100) {
//            grade = "X";
//            System.out.println("학생의 점수 : "+score +" 학생의 학점 : "+ grade +"입니다. ");
//        }
        if (score > 100 || score < 0) { // 얘가 false 라면 score는 0점 이상이면서 100 이하
            grade = "X";
        } else if (score >= 89) {
            grade = "A";
        } else if (score >= 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score < 59) {
            grade = "D";
        } else {
            grade = "F";
            System.out.println("점수를 다시 입력하세요 : ");
        }
        System.out.println("학생의 점수 : "+score +" 학생의 학점 : "+ grade +"입니다. ");

    }
}
