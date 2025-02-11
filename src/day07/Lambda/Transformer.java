package day07.Lambda;

// 트렌스포머 제너릭 함수형 인터페이스를 정의하는 방법
@FunctionalInterface
public interface Transformer<T, R> {
    R transform(T input);
}
