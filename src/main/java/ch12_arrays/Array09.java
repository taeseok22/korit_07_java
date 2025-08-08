package ch12_arrays;

import java.util.Scanner;

/*
    접근 지정자 public 으로 method 들을 정의해서
    직접 정의한 Array08 클래스의 메서드만
    calcSum() / calcAvg() 를 Array09에서도 사용할 수 있다.
    이게 우리가 Scanner를 사용했던 원리랑 같다.
 */
public class Array09 {
    public static void main(String[] args) {
        Array08 array08 = new Array08();
        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 8, 10};
        // 특정 클래스의 인스턴스에 딸려있는 메서드 호출
        int sum = array08.calcSum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
    }
}
// Array10EnhancedFor