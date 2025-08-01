package ch09_classes;

import java.util.Scanner;

public class Car {
    // 필드 선언
    String color;
    int speed;

    int myCar;
    int yourCar;

    // 메서드 정의
    void drive() {
        System.out.println(color + " 자동차가 주행중입니다. ");
    }
    void brake() {
        System.out.println(color + "자동차가 멈췄습니다.");

    }
    void displayInfo() {
        System.out.println("이 차의 색깔은 " + color + "색이고,");
        System.out.println("최고 속도는 " + speed + "km/h입니다. ");
    }

            // 객체 생성 방법
            // 클래스명 객체명 = new 클래스명();

            // 객체에 값 대입 방법
            // 객체명.속성명 = 데이터

            // 객체의 메서드 호출 방법
            // 객체명.메서드명();
    /*
        Car 인스턴스인 myCar 객체를 생성
        color에 빨강 대입, speed 에 160 대입
        yourCar 객체 생성
        color에 노랑 대입, speed 180 대입
        myCar는 drive() 메서드 호출
        yourCar는 brake() 메서드 호출
        myCar, yourCar에 각각 displayInfo() 메서드 호출
     */




}
