package ch07_loops;

import java.util.Scanner;

/*
    Scanner를 이용한 별찍기

    몇 줄의 별을 생성하시겠습니까? : 3

    *
    **
    ***
    로 만들어질 수 있도록 작성하시오.
    다 하면
    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.println("몇 줄의 별을 생성하시겠습니까? : ");
        row = scanner.nextInt();
        // row를 활용한 반복문 작성
//        for (int i = 0 ; i < row ; i++) {
//            for (int j = 0 ; j < i + 1 ; j++) {
//                System.out.print("😂");
//            }
//            System.out.println();
//        }
        for (int i = 0 ; i < row ; i++) {
            for (int j = row ; j - i > 0 ; j--) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
