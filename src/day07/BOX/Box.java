package day07.BOX;

import lombok.ToString;

//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
public class Box<T> {
    T item1;

    Box(T item) {
        this.item1 = item;
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    @Override
    public String toString() {
        return "item1=" + item1;
    }
}
