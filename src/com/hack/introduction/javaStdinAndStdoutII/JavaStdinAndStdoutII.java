package com.hack.introduction.javaStdinAndStdoutII;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();
        String myStr = sc.nextLine();
        sc.close();
        System.out.println("String: " + myStr);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);


    }
}