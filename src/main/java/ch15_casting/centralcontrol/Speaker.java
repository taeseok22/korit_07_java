package ch15_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커 전원을 끕니다.");
    }
}
// CentralControl