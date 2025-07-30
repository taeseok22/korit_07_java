package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = scanner.nextInt();
        String leapyear = "";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leapyear = "윤년입니다.";
        } else {
            leapyear = "윤년이 아닙니다.";
        }
        System.out.println(year + "년은 " + leapyear);
    }
}
