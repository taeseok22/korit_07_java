package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
/*
    실행 예
    몇 명의 학생을 등록하시겠습니까?: 5
    1 번 학생의 이름을 등록하세요: 김일
    김일 학생의 점수를 등록하세요: 4.5
    2 번 학생의 이름을 등록하세요: 김이
    김이 학생의 점수를 등록하세요: 4.4
    3 번 학생의 이름을 등록하세요: 김삼
    김삼 학생의 점수를 등록하세요: 4.3
    4 번 학생의 이름을 등록하세요: 김사
    김사 학생의 점수를 등록하세요: 4.2
    5 번 학생의 이름을 등록하세요: 김오
    김오 학생의 점수를 등록하세요: 4.1

    2. scores 배열에 점수를 입력할 수 있도록 할거다.
    1 번 학생의 점수를 입력하세요: 4.5
    2 번 학생의 점수를 입력하세요: 4.4
    3 번 학생의 점수를 입력하세요: 4.3
    4 번 학생의 점수를 입력하세요: 4.2
    5 번 학생의 점수를 입력하세요: 4.1

    김일 김이 김삼 김사 김오
    4.5 4.4 4.3 4.2 4.1

    학생들 점수의 총합은: 21.5점입니다.
 */
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.println("몇 명의 학생을 등록하시겠습니까? : ");
        index = scanner.nextInt();
        scanner.nextLine();     // 여기로 배리어
        String[] names = new String[index];
        double[] scores = new double[index];
        double sum = 0;

        for (int i = 0 ; i < index ; i++) {
            System.out.println((i+1) + "번 학생의 이름을 입력하세요: ");
            names[i] = scanner.nextLine();
            System.out.println(names[i] + "학생의 점수를 입력하세요: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();     // 바로 위에 nextDouble() 다음에 i++ 이후 nextLine()이 배치될 예정이라 배리어 위치가 여기
            sum += scores[i];
        }

        // 각 배열의 element를 출력하는 반복문 작성할 필요 -> names 출력후 개행이 이뤄지고 그다음 scores가 출력
        for (int i = 0 ; i < names.length ; i++) {
            System.out.println(names[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < scores.length ; i++) {
            System.out.println(scores[i] + " ");
        }
        System.out.println();
        System.out.println("학생들의 점수 총합은 " + sum + "점입니다. ");
    }
}
