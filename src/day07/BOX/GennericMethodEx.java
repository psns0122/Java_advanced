package day07.BOX;

//어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GennericMethodEx {
    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5};
        String[] strs = {"aaa", "bbb", "ccc"};
        Box[] x = new Box[]{new Box<>(4), new Box<>("4"), new Box<>(4.0), new Box<>(true)};

        System.out.println(BoundedGenericMethod.bigger(1, 2));
        System.out.println(BoundedGenericMethod.bigger(3, -5));

        printArray(nums);
        printArray(strs);
        printArray(x);

    }

    static <T> void printArray(T[] items) {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}