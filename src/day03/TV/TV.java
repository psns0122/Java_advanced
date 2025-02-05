package day03.TV;

public class TV implements RemoteControl{
    int volume;

    @Override
    public void turnOn() {
        System.out.println("TV의 전원을 켭니다.");
    }

    @Override
    public void turnOff() {   //인터페이스에서 선언된 전원 on/off TV 스펙에 맞추어구현
        System.out.println("TV 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최대값으로 셋팅 되었습니다.");
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
            System.out.println("mute");
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨은 " + this.volume);
    }
}