package OOPI;

import java.util.*;

public class A1103354_0224_1 {
    public static void main(String args[]) {
        System.out.println("請輸入一個整數：");
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();
        if (A % 2 == 0) {
            System.out.println("您輸入的是偶數。");
        } else {
            System.out.println("您輸入的是奇數。");
        }
    }
}
