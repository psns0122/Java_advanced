package day07.BOX;

//3. Comparable<T> 를 확장하는 타입의 두 객체를 비교하는
//제너릭 메소드 compareTo를 작성하세요. 이 메서드를 이용하여 두 숫자를 비교하세요
public class BoundedGenericMethod {
    static <T extends Comparable<T>> T bigger(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem1(123);
        System.out.println(integerBox.getItem1());
        System.out.println(integerBox.isOfType(Integer.class));

        Box<String> stringBox = new Box<>();
        stringBox.setItem1("Hello Generics");
        System.out.println(stringBox.getItem1());
        System.out.println(stringBox.isOfType(String.class));
    }

}