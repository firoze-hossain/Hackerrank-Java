package com.hack.advanced.canYouAccess;

import java.util.Scanner;

public class CanYouAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Inner in = new Inner();
        Inner.Private p = in.new Private();
        System.out.println(num + " " + p.powerof2(num));
        System.out.println("An instance of class: " + p.getClass().getCanonicalName() + " has been created");
    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "is power of 2" : "is not a power of 2";
            }
        }
    }
}
