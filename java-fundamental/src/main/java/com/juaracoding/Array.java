package com.juaracoding;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int total = 0;
        System.out.print("Masukan jumlah array = ");

        int angka = scanner.nextInt();
        int[] number = new int[angka];

        for (int i = 0; i < number.length;i++) {
            System.out.print("Masukkan array ke-" + i + " = ");
            number[i] = scanner.nextInt();
            total += number[i];

        }
        System.out.println(total);
        */
        double[] price = {12000,13000,11000};
        String[] barang = {"mouse","Keyboard","Speaker"};
        int jml = 0;
        for (int i = 0; i < price.length; i++) {
            jml += price[i];
            i++;
        }
        System.out.println(jml);

        int[][] myNumber = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumber[0][3]);

        for (int i = 0; i < myNumber.length; i++) {
            for (int j = 0; j < myNumber[i].length; j++) {
                System.out.println(myNumber[i][j]);
            }
            
        }
        int rows = 2;
        int colomn = 4;
        int[][] myNmr = new int[rows][colomn];

        String[] kota = {"jakarta", "Bandung", "Surabaya", "Bali", "Makasar"};
        System.out.print("Cari nama kota : ");
        String cari = scanner.nextLine();
        boolean ketemu = false;
        int index = 0;
        for (int i = 0; i < kota.length; i++) {
            if(cari.equalsIgnoreCase(kota[i])){
                ketemu = true;
                index = i;
                break;
            }
        }
        if(ketemu){
            System.out.println("Kota " + kota[index] + " ketemu pada index ke-" + index);

        }else {
            System.out.println("tidak ada nama kota tersebut!");
        }
    }
}
