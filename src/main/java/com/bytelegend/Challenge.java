package com.bytelegend;

public class Challenge {
void add(int a,int b){
        int sum = a+b;
       System.out.println("1+2="+sum);
    }
    void add(int a,int b,int c){
        int sum = a+b+c;
        System.out.println("1+2+3="+sum);
    }
    void add(int a,int b,int c,int d){
        int sum = a+b+c+d;
        System.out.println("1+2+3+4="+sum);
    }
    void add(String a,String b ,String c){
        String sum = a+b+c;
        System.out.println("A+B+C="+sum);
    }
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.add(1,2);
        challenge.add(1,2,3);
        challenge.add(1,2,3,4);
        challenge.add("A","B","C");
    }
}
