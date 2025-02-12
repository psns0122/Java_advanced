package day08.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class UpcastingMain {
    public static void main(String[] args) {
        // 공통된 인터페이스를 구현하므로 사용하는 방식이 동일
        // 자료를 저장하는 방법이 다를 뿐 사용법은 동일하다.
        Collection<Number> data1 = new ArrayList<>();
        Collection<Number> data2 = new HashSet<>();
        Collection<Number> data3 = new LinkedList<>();

        data1.add(1);
        data1.add(2.0);
        data1.add(3.0);
        data1.add(4);
        data1.forEach(System.out::println);

        System.out.println("-------");

        data2.add(1);
        data2.add(2.0);
        data2.add(3.0);
        data2.add(4);
        data2.forEach(System.out::println);

        System.out.println("-------");

        data3.add(1);
        data3.add(2.0);
        data3.add(3.0);
        data3.add(4);
        data3.forEach(System.out::println);

    }
}
