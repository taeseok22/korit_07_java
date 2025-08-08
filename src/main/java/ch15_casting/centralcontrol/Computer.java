package ch15_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터 전원을 끕니다.");
    }
}
/*
    프로그램 구현사항
    interface Power를 implement한 다양한 클래스들을 정의할 예정
    예를 들어 Computer / AirConditioner / Speaker 들이 전부 Power를
    implement 하게 되면 이상의 세 클래스들은 강제적으로
    on() / off() 메서드들을 override 해야만 한다.

    그래서 Computer / AirConditioner / Speaker 객체들을
    전부 Power로 업캐스팅 시키게 된다면
    Computer / AirConditioner / Speaker 객체의 원래 클래스와 상관없이
    Power 클래스의 조작만으로 on() / off() 메서드를 호출 시키는 것이 가능하다.

    즉 B b = new B(); 로 애초에 객체를 생성하면 되지 않냐는 아까까지의 의문은
    A의 자식 클래스가 B 하나 뿐일때만 적용된다고 볼 수 있다.
    A의 자식 클래스가 B C D E F ... 여러 개가 있다고 가정한다면
    그것을 업캐스팅 했을 때 A가 가지고 있는 부모 메서드를 호출함으로써
    다수의 서로 다른 클래스의 객체들을 통제할 수 있다는 장점 때문에
    업캐스팅을 적용하게 된다.
    그리고 다운캐스팅을 해서 각각 클래스의 고유 메서드도 실행시킬 수 있겠네.

    AirConditioner 클래스 생성해서 Power implement 하고
    에어컨 전원을 켭니다.
    에어컨 전원을 끕니다. 로 재정의 하시오.
    Speaker도 동일하게 하시오.
 */