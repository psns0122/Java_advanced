package day07.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        // 여기서 굳이 asList 를 써야하는 이유 : {} 를 이용해 즉시 배열을 생성할 수 없으므로
        List<String> words = Arrays.asList("hello", "world", "java", "in", "love");

        // words.stream() : 리스트형 데이터를 스트림형 데이터로 변환 (요소에 대한 순차적 접근이 가능해짐)
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 4) // 길이가 4 이하인 단어 제거
                .map(word -> word.toUpperCase()) // 살아남은 친구들에 대해 upper
                .collect(Collectors.toList()); // 파편처럼 흩어진 친구들 다시 리스트로 만들어서 반환하자

        System.out.println(filteredWords);
        System.out.println(words); // 원본은 수정되지 않음
    }
}
