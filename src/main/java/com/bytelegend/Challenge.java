package com.bytelegend;

public class Challenge {
    private static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    private static int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    private static int add(int a, int b, int c, int d){
        int sum = a + b + c + d;
        return sum;
    }
    private static String add(String a, String b, String c){
        String s = a + b + c;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
}
