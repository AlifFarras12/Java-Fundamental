package com.juaracoding;

public class BlockProgram {
    public static void main (String[] args) {
        System.out.println("Hello and welcome!");
        String cityName = "Jakarta";
        if(true){
            System.out.println("True");
            System.out.println(cityName);
        }
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println(cityName);
        }
    }
}