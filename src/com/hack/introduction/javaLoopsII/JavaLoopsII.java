package com.hack.introduction.javaLoopsII;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                a += (int) (Math.pow(2, j) * b);
                System.out.print(Integer.toString(a) + " ");
            }
            System.out.print("\n");
        }

    }
}
