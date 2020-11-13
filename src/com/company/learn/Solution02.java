package com.company.learn;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int num = sa.nextInt();
        getP(num);
    }

    private static void getP(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
                getP(num);
            }
            if (num == i) {
                System.out.println(num);
            }
        }
    }
}
