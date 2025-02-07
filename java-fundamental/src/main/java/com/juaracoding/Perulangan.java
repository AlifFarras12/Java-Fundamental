package com.juaracoding;
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            while(i % 2 == 1) {
                System.out.println(i);
                i++;
            }
        }
        int sisi = 10;
        for(int i = sisi; i >= 0;i--){
            for (int j = i; j >= 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("Masukkan jumlah barang : ");
        int jmlBarang = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= jmlBarang; i++) {
            System.out.print("Masukkan harga barang ke - " + i + " : ");
            int hargaBarang = scanner.nextInt();
            total += hargaBarang;

        }
        System.out.println("Total Harga : " + total);

        scanner.close();
    }
}