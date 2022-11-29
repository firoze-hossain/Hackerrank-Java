package com.hack.advanced.primeChecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeChecker {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int num4 = Integer.parseInt(br.readLine());
        int num5 = Integer.parseInt(br.readLine());
        Prime p = new Prime();
        p.checkPrime(num1);
        p.checkPrime(num1, num2);
        p.checkPrime(num1, num2, num3);
        p.checkPrime(num1, num2, num3, num4, num5);

    }
}

class Prime {
    public void checkPrime(int... num) {
        for (int n : num) {
            BigInteger bg = BigInteger.valueOf(n);
            if (bg.isProbablePrime(1)) {
                System.out.printf("%s ", bg);
            }
        }
        System.out.println();


    }
}
