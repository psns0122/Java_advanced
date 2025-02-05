package day03.Animal;

class Cat extends Tail implements Pet, Animal{
    Cat(int size) {
        super(size);
    }

    @Override
    public void cry() {
        System.out.println("애옹");
    }

    @Override
    public void play() {
        System.out.println("사냥놀이 ㄱㄱ");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat mango = new Cat(20);
        mango.play();
        mango.cry();
    }
}
