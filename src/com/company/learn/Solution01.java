package com.company.learn;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        String str = sa.nextLine();
        int start = 0, end = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
                if (start < count) {
                    start = count;
                    end = i;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(start);
        System.out.println(str.substring(end-start,end+1));
    }
}
