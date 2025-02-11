package day07.Lambda;

import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {
        // 현재 코드에서 제너릭의 역할 :
        // 타입의 정확성을 보장하여 유연성을 제공하는 방법으로 사용됨.
        Transformer<Integer, String> IntToString = (input -> "Number: " + input);
        String result = IntToString.transform(4);
        System.out.println(result.toString() + 1);

        Transformer<String, Integer> len = (input -> input.length());
        System.out.println(len.transform(result));
    }

    // 람다식을 언제 적용할 수 있는건지 모르겠다.
    // 함수의타입 함수이름 = (매개변수 -> 처리할 문장)

}
