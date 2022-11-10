package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public int add(int i, int j){
        return i+j;
    }

    public int add(int i, int j, int k){
        return i+j+k;
    }

    public String add(int i, int j, int k, int l){
        return i+j+k+l;
    }

    public String add(String a, String b, String c){
        return a+b+c;
    }
}
