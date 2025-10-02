package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;    // 접근지정자 클래스명 객체명 -> 여태까지 작성방법과 다르다.
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton, VolumeUpButton volumeUpButton,
                              VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }
    // 볼륨 버튼 추가하고 ALlArgsConstructor 생성하면 Main에서 오류 발생한다.
    // 왜 ?
    // Main 에는 채널버튼까지의 ALlArgsConstructor로 객체가 생성되어 있어서 -> Main 수정하러 가야함

//        public TvRemoteController(PowerButton powerButton,
//                              ChannelDownButton channelDownButton,
//                              ChannelUpButton channelUpButton) {
//        this.powerButton = powerButton;
//        this.channelDownButton = channelDownButton;
//        this.channelUpButton = channelUpButton;
//    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    // # 2
    public void onUpChannelUpButton() {
        System.out.println(channelUpButton.onUp());
    }

    // 여기서 풀이법 두가지
    // # 1
    public String onUPChannelUpButton1() {
        return channelUpButton.onUp();  // onUp(); 의 결과값이 return "채널을 계속 " + super.onUp();
    }


    // 음량 조절 파트
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    // # 1
    public String onUpVolumeUpButton() {
        return volumeUpButton.onUp();
    }
    // # 2
    public void onUpVolumeUPButton() {
        System.out.println(volumeUpButton.onUp());
    }
}
