package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        // 참조 자료형의 배열을 생성(비어있는거)
//        Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에
        // 예시만 보여주고 안쓸거다.
//        CentralControl centralControl1 = new CentralControl(powers);
//        CentralControl centralControl1 = new CentralControl(new Power[5]);

        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};
        // 저희는 그래서 centralControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을 집어 넣었다.
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(computer);     // 여기서 (암시적) 업캐스팅이 이뤄졌다.
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);

    }

}
