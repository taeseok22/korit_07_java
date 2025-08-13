package org.example;


import java.util.Scanner;

public class BmiCalc {
    String name;
    double height;
    double weight;
    Person person;
    // call1() 형태로 메서드화 시키는 게 그 다음 task
    public void calcBmi() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("이름을 입력하세요: ");
//        String name = scanner.nextLine();
//        System.out.println("키(cm)를 입력하세요: ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.println("몸무게(kg)를 입력하세요: ");
//        double weight = scanner.nextDouble();
        double bmi = weight/((height/100 * height/100));
        String result = "";
        System.out.println(bmi);
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "비만 전 단계";
        } else if (bmi < 30) {
            result = "1단계 비만";
        } else if (bmi < 35) {
            result = "2단계 비만";
        } else {
            result = "3단계 비만";
        }
        System.out.println(name + "님의 BMI 지수는: " + bmi + "이므로" + result + "입니다.");
    }
    // call3() 형태로 메서드화 시킬거다.
    public void calcBmi(String name, double height, double weight) {
        // method 정의 할 때 argument 와 parameter 개념을 혼란스러워하는 경우가 있는데
        // 정의 -> 호출이라는 순서라고 생각할 때
        // 소괄호 내에 있는 매개변수 목록들은 자료형 +(임의의) 변수명 으로
        // 이뤄져 있기 때문에 '선언'이라고 간주해주면 좋겠다.
        // call1() 유형에서 height를 scanner로 받았을 때 바로 0.01을 곱해서
        // m로 치환했었는데 우린 double bmi 부터 긁어왔을 때 cm 기준일 수도 있기 때문에
        // 추가 작업을 하겠다
        // height = height * 0.01;
        double bmi = weight/((height/100 * height/100));
        String result = "";
        System.out.println(bmi);
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "비만 전 단계";
        } else if (bmi < 30) {
            result = "1단계 비만";
        } else if (bmi < 35) {
            result = "2단계 비만";
        } else {
            result = "3단계 비만";
        }
        System.out.println(name + "님의 BMI 지수는: " + bmi + "이므로" + result + "입니다.");
    }
    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public static void calcBmi(Person person) {
        // Person class의 각 field 들에 private을 적용했기 때문에 값을 불러오기 위해선
        // Getter를 사용해야만 한다. 근데 그럼 코드가 너무 길어져서
        double height = person.getHeight();     // 지역 변수들을
        double weight = person.getWeight();     // 선언하고 거기에 값을
        double bmi = weight/((height/100 * height/100));
        String result = "";
        System.out.println(bmi);
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "비만 전 단계";
        } else if (bmi < 30) {
            result = "1단계 비만";
        } else if (bmi < 35) {
            result = "2단계 비만";
        } else {
            result = "3단계 비만";
        }
        System.out.println(person.getName() + "님의 BMI 지수는: " + bmi + "이므로" + result + "입니다.");

    }

    // 계산방법 : 체중(kg) ÷ {신장(m) × 신장(m)}
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("이름을 입력하세요: ");
//        String name = scanner.nextLine();
//        System.out.println("키(cm)를 입력하세요: ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.println("몸무게(kg)를 입력하세요: ");
//        double weight = scanner.nextDouble();
//        double bmi = weight/(height * height);
//        String result = "";
//        System.out.println(bmi);
//        if (bmi < 18.5) {
//            result = "저체중";
//        } else if (bmi < 23) {
//            result = "정상";
//        } else if (bmi < 25) {
//            result = "비만 전 단계";
//        } else if (bmi < 30) {
//            result = "1단계 비만";
//        } else if (bmi < 35) {
//            result = "2단계 비만";
//        } else {
//            result = "3단계 비만";
//        }
//        System.out.println(name + "님의 BMI 지수는: " + bmi + "이므로" + result + "입니다.");
//        if (bmi < 18.5 ) {
//            System.out.println(name + "님의 BMI 지수는: " + bmi + "저체중 입니다.");
//        } else if (bmi < 18.5 || bmi > 22.9) {
//            System.out.println(name + "님의 BMI 지수는: " + bmi + "정상 입니다.");
//        } else if (bmi > 23 || bmi > 24.9) {
//            System.out.println(name + "님의 BMI 지수는: " + bmi + "과체중 입니다.");
//        } else if (bmi > 25) {
//            System.out.println(name + "님의 BMI 지수는: " + bmi + "비만 입니다.");
//        } else {
//
//        }
//
    
        /*
            실행 예
            이름을 입력하세요: 김일
            키(cm)를 입력하세요: 172
            몸무게(kg)를 입력하세요: 68
            김일 님의 BMI 지수는 23.0으로 과체중입니다.
         */

        // call1() 유형으로 작성했기 때문에 객체 생성
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBmi();

        // 여기에 Person 객체 생성해야 하는데 일반적 방식 말고
        // Builder 패턴 적용한 방식으로 생성해서
        // calcBmi() 메서드의 argument로 집어넣어야한다.


        BmiCalc bmiCalc1 = new BmiCalc();
        bmiCalc1.calcBmi("김일", 172, 68);

        org.example.Person person1 = org.example.Person.builder()
                .name("김일")
                .height(172)
                .weight(68)
                .build();
        System.out.println();
        calcBmi(person1);

        System.out.println("--- 객체 생성 후 call3() 활용 방법 ---");
        // 1. Person 객체 생성
        // 1-1. 원래 객체 생성 방법
        Person person4 = new Person("김사", 172, 68);
        System.out.println(person4);
        // 1-2 Builder 패턴 사용 객체 생성 방법
        Person person5 = Person.builder()
                .name("김오")
                .height(172)
                .weight(68)
                .build();
        System.out.println(person5);

    }
}
