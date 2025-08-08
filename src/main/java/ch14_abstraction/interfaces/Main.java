package ch14_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스 생성
    얘를 TvRemoteController의 필드에 추가
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUPButton() / onUpVolumeUpButton() 메서드를 정의하고
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.    # 1 로 풀고
    음량을 계속 올립니다.    # 2 로 풀고

 */
public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        TvRemoteController tvRemoteController = new TvRemoteController(powerButton, channelDownButton, channelUpButton);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
        new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeUpButton(), new VolumeDownButton());
        AirConditionerController airConditionerController = new AirConditionerController( new PowerButton(),
                new TemperatureDownButton(), new TemperatureUpButton(), new ModeChangeButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onUpChannelUpButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();
        tvRemoteController.onPressedChannelUpButton();
        // # 1 의 대한 Main에서 실행 방법
        System.out.println(tvRemoteController.onUPChannelUpButton1());
        System.out.println();
        // # 2 의 대한 실행 방법
        tvRemoteController.onUpChannelUpButton();
        System.out.println();
        // 볼륨
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton());        // # 1 String
        tvRemoteController.onUpVolumeUPButton();        // # 2 void
        System.out.println();
        // 객체 생성
        airConditionerController.airConditionerController();
        // 전원
        airConditionerController.PowerButton();
        // 온도 내리기
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        // 온도 올리기
        airConditionerController.onPressedTemperatureUpButton();
        airConditionerController.onUpTemperatureUpButton();
        // 모드 바꾸기
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
        // 전원
        airConditionerController.PowerButton();
    }
}
