package ch09_classes;

public class Constructor {
    // 필드 선언
    int num;
    String name;

    // 기본 생성자 정의 -> 원래 기본적으로 만들어진다.
    // 그리고 매개변수의 유무만 있고, return이 없어서 call1() / call2() 유형이라고 했으니까
    // 기본 생성자는 call1() 유형에 해당할 것이고, 클래스명과 동일한 메서드명을 가진다.
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수 생성자 정의 -> 기본적으로 만들어지지 않는다. 개발자가 정의해야 함.
    // 근데 매개변수 생성자가 하나라도 만들어지면 default로 만들어진 기본 생성자가 사라지기
    // 때문에 기본 생성자와 매개변수 생성자를 둘 다 사용하고 싶으면
    // 기본 생성자도 따로 '명시적으로 정의' 해야만 한다.
    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number; // this: 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체함.

    }

    // String title을 매개변수로 하는 생성자를 정의하고,
    // RequiredArgsContructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을 출력할 수 있도록
    // 작성한 뒤
    // ConstructorMain 으로 가서, constructor3이라는 객체명을 지니고, title에 "여러분이름"으로
    // 지어 객체를 생성한 후,
    // System.out.println(constructor3.name); 을 입력해 콘솔에 여러분 이름을 출력하시오.
    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자");
        this.name = title;
    }

}
