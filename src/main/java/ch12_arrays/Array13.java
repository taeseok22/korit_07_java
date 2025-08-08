package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Muti-Dimensional Array) 중에서 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상
    2차원 배열 이상을 다루는 경우는 극히 드물기 때문에 2차원 배열을
    기준으로 강의한다.

    형식 :

    int[][] arr01 = new int[크기][크기];        - 선언 방식 # 1
    int[][] arr02 = new int[크기];             - 선언 방식 # 2
    int[][] arr03 = { {1, 2}, {3, 4}, {5, 6} };        - 선언 방식 # 3 및 초기화

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 함.
        -> 2번 방식에 해당.
        1열 2열(column)
         ↓  ↓
        {1, 2},     →   1 행(row)     가로줄을 '행'
        {3, 4},     →   2 행
        {5, 6}      →   3 행
 */
public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = { {1, 2}, {3, 4}, {5, 6} };
        // 5라는 숫자를 뽑아내고 싶다.
        System.out.println(arr03[2][0]);    // 결과값 : 5
        System.out.println(arr03[2]);       // 결과값 : [I@36baf30c
        System.out.println(arr03);          // 결과값 : [[I@7a81197d
        System.out.println(Arrays.toString(arr03)); // 결과 : [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        // 2차 배열의 element 추출 -> 중첩 for문을 사용해야한다.
        for (int i = 0 ; i < arr03.length ; i++) {
            // 반복문 하나 파고 들어가봐도 여전히 배열이기 때문에 이 붑누에서 1차 배열을 추출하기 위한
            // 반복문을 추가로 작성해야한다.
            for (int j = 0 ; j < arr03[i].length ; j++) {
                System.out.println(arr03[i][j]);
            }
        }
        // 그러면 향상된 for문으로 2차 배열 내부의 element를 추출하시오.
        // enhanced for loop
        int num ;
        for (int[] firstArray : arr03) {
            for (int element : firstArray) {
                System.out.println(element + " ");
            }
            System.out.println();
        }

    }
}
