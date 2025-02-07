package com.juaracoding;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String registeredEmail = "user@gmail.com";
        String registeredPhoneNumber = "08123456";
        String correctOTP = "abc123";

        System.out.println("Masukkan Nomor Telpon atau Email:");
        String userInput = scanner.nextLine();

        if (userInput.equals(registeredEmail) || userInput.equals(registeredPhoneNumber)) {
            System.out.println("Masukkan OTP dari email/no telpon :");
            String otpInput = scanner.nextLine();

            if (otpInput.equals(correctOTP)) {
                System.out.println("Login suksess!!");
            } else {
                System.out.println("OTP Salah!");
            }
        } else {
            System.out.println("Invalid email or phone number!");
        }

        System.out.print("Sudah Berpenghasila? (Y/N) : ");
        String kondisi = scanner.nextLine();

        if (kondisi.equalsIgnoreCase("Y")){
            System.out.print("Masukkan gaji : ");
            long gajiInput = scanner.nextInt();

            if(gajiInput >= 0 && gajiInput <=50000000){
                System.out.println("tarif pajak 5%");
            }
            else if(gajiInput > 50000000 && gajiInput <=250000000){
                System.out.println("Tarif Pajak 15%");
            }
            else if(gajiInput > 250000000 && gajiInput <= 500000000){
                System.out.println("tarif Pajak 25%");
            }
            else if(gajiInput > 500000000){
                System.out.println("Tarif Pajak 30%");
            }

        }
        else{
            System.out.println("Anda tidak wajib pajak!");
        }
        scanner.close();
    }
}

