package com.hack.introduction.javaEndOfFile;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String str;
        while (sc.hasNext()) {
            str = sc.nextLine();
            System.out.println(count + " " + str);
            count++;
        }
    }

}
