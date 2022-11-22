package com.hack.introduction.javaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        int b, h;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        sc.nextLine();
        h = sc.nextInt();
        areaParallelogram(b, h);
        sc.close();
    }

    public static void areaParallelogram(int b, int h) {
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }

    }
}
