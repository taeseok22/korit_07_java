package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();
        System.out.println();
        Animal animal1 = dog1;  // 업캐스팅 # 1
        // 예시
        int a = 1;
        System.out.println(a);
        animal1.makeSound();    // 강아지가 강아지가 짖습니다. 즉 재정의된 method가 호출됨.
//        animal1.fecth();    // 이게 불가능
        System.out.println();
        Animal animal2 = new Dog(); // 이게 제가 말하는 A a = new B(); 형태다. 시험에 자주 나옴
        animal2.makeSound();
//        animal2.fetch();  // 불가능

        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드 즉 자식 클래스의 메서드가 호출됨
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능

            그럼 어차피 재정의돈 method 버전으로 호출이 될거라면 애초에
            클래스B 객체명 = new 클래스B(); 생성해버리면 재정의된 method도 호출되고 고유 method도
            호출할 수 있으니까 골치 안아픈거 아니냐
         */

        Animal animal3 = new Animal();
        animal3.makeSound();    // 결과값 : 동물이 소리를 냅니다.

        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);    // true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);    // true

        // : 업캐스팅이 이뤄지지 않고 그냥 Dog dog1 = new Dog();로 만든 객체 역시
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);    // true
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);    // true

        // animal3의 경우 Animal animal3 = new Animal();로 생성했다.
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);    // false

        System.out.println("↑ 업캐스팅 파트 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("↓ 다운캐스팅 파트");
        /*
            다운캐스팅은 '명시적'으로 이뤄져야한다.
            방법
            (클래스명)객체명; -> (int)2.3; 과 같은 방식이다. conversion의 객체 버전이라고 생각하면 된다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려해야한다.
         */
        Dog dog2 = (Dog) animal2;   // 다운캐스팅 방법 -> 위에 보면 Animal animal2 = new Dog(); 으로 생성해서
        // dog2 객체명은 없다.
        dog2.makeSound();   // 개가 짖습니다.
        dog2.fetch();
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용해 Animal 클래스의
        // 인스턴스인 animal2를 downcasting 했다.
        // 그 결과 원래도 되던 재정의 버전의 makeSound(); 호출은 변함이 없고
        // Dog 클래스의 고유 메서드만 fetch();도 호출 가능
        // 여전히 B b = new B();로 생성하면 귀찮은 일 없지 않냐는 의문이 존재한다.

//        Dog dog3 = (Dog) animal3; // downcasting을 하는 과정에서 오류가 발생함
//        dog3.makeSound(); // 그러니 얘는 지금 호출도 못해보는 상황이다.
        /*
            74번 라인에서 오류가 발생했다.
            즉 애초에 animal3을 생성할 때 Animal 클래스의 생성자로 호출해서 만들었기 때무네
            (A a = new A()
         */
        Animal animal4 = new Animal();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야한다.(그리고 둘은 상속관계가 되야한다)
        // 그러면 현재 코드라인 상에서 빨간줄 안뜨니까 잘못 다운캐스팅이 이뤄지는거에 대한
        // 학인도 불가능 상황인데 이를 해결하기 위한 것이 instanceof 연산자다.

        System.out.println("animal4 검증 파트");
        if (animal4 instanceof Dog) {       // 이 조건식이 true라인 animal4의 생성시 호출된 생성자는 Dog();
            Dog dog4 = (Dog) animal4;

            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("animal3은 다운캐스팅 안되는거 알았으니 검증 후에 다운캐스팅 시도 해야겠네.");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }

        // centralcontrol
    }

}
