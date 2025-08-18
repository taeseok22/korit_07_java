package ch23_lambda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        // 우리가 정의한 interface Calculator 를 사용할거다.
        // 근데 인터페이스 내부엔 두 개의 매개변수만 정의되어있었다.
        // 우린 여기서 추가 조작을 통해서 사칙 연산을 시도할거다.

        Calculator add = (x, y) -> x + y;   // Calculator 인터페이스의 객체명이 add고 내부 메서드는 calculate()
        Calculator sub = (x, y) -> x - y;   // Calculator 인터페이스의 객체명이 sub고 내부 메서드는 calculate()
        Calculator mul = (x, y) -> x * y;   // Calculator 인터페이스의 객체명이 mul 고 내부 메서드는 calculate()
        Calculator div = (x, y) -> x / y;   // Calculator 인터페이스의 객체명이 div고 내부 메서드는 calculate()

        System.out.println(add.calculate(2,3)); // 15번 라인의 주석을 참고했을 때의 올바른 메서드 호출 방식
        System.out.println(sub.calculate(2,3)); // 근데 너무 길어서 우린 static method 를 정의 했다.
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2, 3, add));    // static method 의 로직
        // 세번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받는다.
        // 그리고 return 문을 보면 해당 객체의 .calculate() 메서드를 호출하는 것을 확인할 수 있다.
        // 근데 add.calculate() 는 return이 x + y니까, 결과값이 5가 나왔다.
        // 그럼 우린 24번 코드 라인의 해석을 위해서
        // Calculator 인터페이스와 CalculatorMain의 static method와 그리고 main 에서의 lambda 식을 전부
        // 왔다갔다 하면서 볼 필요가 있다는 의미가 된다.
        System.out.println("2 * 3 = " + operate(2,3,mul));
    }
}
