package day03.TV;

public class RemoteControlMain {
    public static void main(String[] args) {
        // 리모컨을 구입한다.
        RemoteControl remote;

        // 새로산 리모컨에 TV를 설정한다.
        remote = new TV();
        // 리모컨을 이용하여 TV를 켠다.
        remote.turnOn();
        // 리모컨을 이용하여 볼륨을 10으로 설정하고 설정값을 확인한다.
        remote.setVolume(10);
        // 리모컨을 이용하여 TV를 끈다.
        remote.turnOff();

        // 리모컨을 라디오에 페어링 한다.
        remote = new Radio();
        // 리모컨을 이용하여 라디오를 켠다.
        remote.turnOn();
        // 리모컨을 이용하여 볼륨을 20으로 설정하고 설정값을 확인한다.
        remote.setVolume(20);
        // 리모컨을 이용하여 라디오를 끈다.
        remote.turnOff();
    }
}
