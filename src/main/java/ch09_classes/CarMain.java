package ch09_classes;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        Car myCar = new Car();
        // 필드에 값 대입
        myCar.speed = 160;
        myCar.color = "빨강";
        // 객체 생성 2
        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;


        // 메서드 호출
        myCar.drive();
        yourCar.drive();
        myCar.brake();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();

    }
}
