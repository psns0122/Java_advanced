package day08.Hash;

import java.util.Scanner;

public class HashTest {
    public static void main(String[] args) {
        int[] arr = new int[100];


        int num;
        int index;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            // 해시 공식을 사용하는 부분
            index = (num * 99 + num * 2025 + num * 8) % 100;

            arr[index] = num;

            System.out.println(arr[index] + " : " + index);
        }

    }
}
