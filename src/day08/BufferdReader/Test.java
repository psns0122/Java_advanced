package day08.BufferdReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // 스캐너
        String str;
        String str1;
        String str2;

        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        // 버퍼드
        String str3;
        String str31;
        String str32;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            str3 = br.readLine();
            str31 = br.readLine();
            str32 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(str3);
        System.out.println(str31);
        System.out.println(str32);

    }
}
