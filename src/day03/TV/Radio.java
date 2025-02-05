package day03.TV;

public class Radio implements RemoteControl{
    int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");
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
        System.out.println("현재 라디오 볼륨은 " + this.volume);
    }
}