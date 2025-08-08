package ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {
    // method 정의 영역
    // call1() 유형으로 작성할 것
    public static void calcSumAndAvg() {
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 과목의 점수를 입력하시겠습니까? :");
        numOfSubs = scanner.nextInt();
        // 반복문을 작성해야대는데, 한계값이 numOfSubs와 관련있다.
        for (int i = 0 ; i < numOfSubs ; i++) {
            System.out.println((i+1) + "과목의 점수를 입력하세요: ");
            sum += scanner.nextDouble();
        }
        System.out.println(sum);
        avg = sum / numOfSubs;
        System.out.println("총합은 " + sum + "이며, " + "평균은" + avg + " 입니다. ");
    }

    public static void main(String[] args) {
        // 메서드 호출 영역
        calcSumAndAvg();
        calcSumAndAvg();
        calcSumAndAvg();
        calcSumAndAvg();
        // 이상과 같이 호출했을 때 아까와 동일한 기능을 하도록 작성하시오.

    }
}
