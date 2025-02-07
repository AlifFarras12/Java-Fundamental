package com.juaracoding;

public class Operator {
    public static void main(String[] args){
        int num1 = 11;
        int num2 = 13;
        int sum = num2 + num1;

        System.out.println(sum);

        int num3 = 10 & 12;
        System.out.println(num3);

        String decimal = Integer.toBinaryString(num3);
        System.out.println(decimal);

        System.out.println(num3<<1);

        boolean multiCondition = true && false || true;
        System.out.println(multiCondition);

        String text1 = "Singkil";
        String text2 = "Singkil";
        System.out.println(text1.equals(text2));
        System.out.println(text1.toUpperCase());
    }
}
