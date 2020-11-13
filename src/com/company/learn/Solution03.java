package com.company.learn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        String str = sa.nextLine();
    }

    private static void getP(String str) {
        HashSet<Character> set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
