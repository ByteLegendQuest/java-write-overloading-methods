package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    private int add(int a, int b) {
        return a + b;
    }
    private int add(int a, int b, int c) {
        return a + b + c;
    }
    private int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    private String add(Stirng sa, String sb, String sc) {
        return sa + sb + sc;
    }
}
