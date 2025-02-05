package day03.TV;

public interface RemoteControl {
    public static final int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    public abstract void turnOff();

    public abstract void setVolume(int volume);

}