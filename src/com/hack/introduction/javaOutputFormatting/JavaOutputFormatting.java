package com.hack.introduction.javaOutputFormatting;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String myString = sc.next();
            int myInt = sc.nextInt();

            System.out.printf("%-15s%03d\n", myString, myInt);

        }
        System.out.println("================================");
    }
}
