package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }
    public static int add(int... n) {
        int res = 0;
        for(int i : n) {
            res += i;
        }
        return res;
    }
    public static int add(String... ss) {
        String res = "";
        for(String str : ss) {
            res += str;
        }
        return res;
    }
}
