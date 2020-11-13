package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test001 {
    public static void main(String[] args) throws Exception {
        //f1(9);
        //f2(80);
        //f3(21, 12);
        //f4();
        //f5();
        //f6();
        //f7();
        //f8();
        //f9();
        //f10();
        //int n = f11(4);
        //System.out.println(n);
        //f12();
        //f13();
        //f14();
        //f15();
        //f16();
        //f18();
    }

    public static void f18() {
        int monkey = 0;
        int a =getPeach(monkey);
        System.out.println(a);
    }
    public static int getPeach(int monkey) {
        if (monkey <5) {
            return (getPeach(monkey+1)*5+1);
        }else{
            return 1;
        }
    }

    private static void f16() {
        System.out.println("请输入数字0-9：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入数字重复次数：");
        int b = sc.nextInt();
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < b; i++) {
            temp += a;
            sum += temp;
            a = a * 10;
        }
        System.out.println(sum);
    }

    private static void f15() {
        // TODO Auto-generated method stub
        int k = 2;
        int num = 54;
        System.out.print(num + "=");
        while (num > k) {
            if (num % k == 0) {
                System.out.print(k + "*");
                num = num / k;
            } else {
                k++;
            }
        }
        System.out.println(k);
    }

    private static void f14() {
        int H = 7, W = 7;//高和宽必须是相等的奇数
        for (int i = 0; i < (H + 1) / 2; i++) {
            for (int j = 0; j < W / 2 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k < (i + 1) * 2; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= H / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= W - 2 * i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

    private static void f13() {
        int x = 1;
        for (int i = 0; i < 10; i++) {
            x = (x + 1) * 2;
        }
        System.out.println(x);
    }

    private static void f12() {
        int monkey = 1;//进行分桃的猴子数
        int peaches, peach;//桃的总数和每次分桃的总数
        peaches = 1;
        peach = peaches;
        while (monkey <= 5) {
            if (peach % 5 == 1 && peach / 5 != 0) {
                peach = (peach / 5) * 4;
                monkey++;
            }//符合条件进行下一次的分桃
            else {
                peaches++;
                peach = peaches;
                monkey = 1;
            }
        }
        System.out.println(peaches);

    }


    private static int f11(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 1 + (5 * f11(n - 1));
        }
    }

    private static void f10() {
        int[] arr = new int[]{2, 3, 5, 7, 12, 56, 65, 69, 70, 84,};
        System.out.println("请输入排成一圈的人数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int pos = 0;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (n >= arr[i] && n <= arr[i + 1]) {
                pos = i + 1;
            }
            newArr[i] = arr[i];
            newArr[arr.length] = n;
        }
        for (int i = newArr.length - 1; i >= pos; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[pos] = n;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    private static void f9() {
        System.out.println("请输入排成一圈的人数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        boolean[] in = new boolean[n];
        for (int i = 0; i < n; i++) {
            in[i] = true;
        }
        int count = n;
        int index = 0;
        int number = 0;
        while (count > 2) {
            if (in[index]) {
                number++;
                if (number == 3) {
                    number = 0;
                    in[index] = false;
                    count--;
                }

            }
            index++;
            if (index == n) {
                index = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (in[i]) {
                System.out.println(i + 1);
            }
        }
    }

    private static void f8() {
        for (char a = 'x'; a <= 'z'; a++) {
            for (char b = 'x'; b <= 'z'; b++) {
                if (a != b) {
                    for (char c = 'x'; c <= 'z'; c++) {
                        if (a != c && b != c && a != 'x' && c != 'x' && c != 'z') {
                            System.out.println("a" + a);
                            System.out.println("b" + b);
                            System.out.println("c" + c);

                        }
                    }
                }
            }
        }
    }

    private static void f7() {
        System.out.print("请输入三个数\n");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        System.out.println(i < j ? (i < k ? i : k) : (j < k ? j : k));
    }

    private static void f6() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
    }

    private static void f5() {
        int s;
        for (int i = 1; i < 1000; i++) {
            s = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s = s + j;
                }
            }
            if (s == i) {
                System.out.println(i + " ");
            }
        }
//        int s;
//        for(int i=1;i<=1000;i++)
//        {
//            s=0;
//            for(int j=1;j<i;j++)
//                if(i % j==0)
//                    s=s+j;
//            if(s==i)
//                System.out.print(i+" ");
//        }
//        System.out.println();
    }

    private static void f4() throws Exception {
        int s = 0;
        String output = "";
        BufferedReader stadin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入a的值");
        String input = stadin.readLine();
        for (int i = 1; i <= Integer.parseInt(input); i++) {
            output += input;
            int a = Integer.parseInt(output);
            s += a;
        }
        System.out.println(s);
    }

    private static void f3(int a, int b) {
        int start;
        start = a >= b ? b : a;
        for (int i = start; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
        }
    }

    private static void f2(int n) {
        System.out.println(n >= 90 ? "A" : (n < 60 ? "C" : "B"));
    }

    private static void f1(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
                f1(n / i);
            }
        }
        System.out.print(n);
        System.exit(0);
    }
}
