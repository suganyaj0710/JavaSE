package com.javaSE8.ClassAndDeclaration;

public class Second {
    private int i;
    private int j;
    static void sum(int a, int b){
        System.out.println("i+j: " +(a+b));
    }
    public static void main(String[] args) {
        sum(3,4);
        sum(4,9);
        sum(7,0);
        Second Secobj = new Second(2,3);
        Second thirdobj = new Second(4,5);
        thirdobj.i =345;
        thirdobj.j = 100;
        System.out.println(thirdobj.i);
        System.out.println(Secobj.i);
    }

    public Second(int c, int d) {
        this.i = c;
        this.j = d;
    }
}
