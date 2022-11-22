package com.hack.introduction.javaIntToString;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
