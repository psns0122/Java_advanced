package day08.sorting;

import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후  사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        @Getter
        class User implements Comparable<User> {
            private String name;
            private int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            //return 값이 양수면 자리교환 ,  0 이거나 음수면 자리교환 없음
//            @Override
//            public int compareTo(User o) {
//                if (this.name.charAt(0) == o.name.charAt(0)) {
//                    if (this.age < o.age) {
//                        return -1;
//                    } else { return 1; }
//                } else if (this.name.charAt(0) < o.name.charAt(0)) {
//                    return -1;
//                } else {
//                    return 1;
//                }
//            }
            @Override
            public int compareTo(User o) {
                return this.age - o.age;
            }

            @Override
            public String toString() {
                return this.name + " " + this.age;
            }

        }

        // List에 5명의 사용자 저장 후 정렬
        List<User> users = new LinkedList<User>();
        users.add(new User("a", 1));
        users.add(new User("b", 2));
        users.add(new User("cb", 3));
        users.add(new User("ca", 4));
        users.add(new User("d", 5));

        Collections.sort(users);

        // 정렬 리스트 출력
        users.forEach(System.out::println); // 컬렉션 사용하는 경우
        users.stream().sorted().forEach(System.out::println); // 스트림 사용하는 경우

        users.sort((o1, o2) -> {
            return o1.age - o2.age;
        });

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
                //return o1.name.compareTo(o2.name);
            }
        });

        Collections.sort(users, (u1, u2) -> Integer.compare(u1.age, u2.age));

        Collections.sort(users, Comparator.comparing(User::getAge));

        Collections.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName));


    }
}
