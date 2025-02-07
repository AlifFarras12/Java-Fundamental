package com.juaracoding;
import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = 'a';
        Character value = character;
        System.out.println(value.charValue());

        String salaryy = "2000";
        int angka = Integer.parseInt(salaryy);
        double pph21 = angka*11/100;

        System.out.println(angka-pph21);

        // Method AddEmployee
        System.out.println("Firstname = ");
        String firstName = scanner.nextLine();
        System.out.println("Lastname = ");
        String lastName = scanner.nextLine();
        System.out.println("Gmail = ");
        String gmail = scanner.nextLine();
        System.out.println("Age = ");
        String age = scanner.nextLine();
        System.out.println("Salary = ");
        String salary = scanner.nextLine();
        System.out.println("Departement = ");
        String department = scanner.nextLine();
        formAddEmployee(firstName, lastName, gmail, age, salary, department);

        // replace $
        String price1 = "$29.90";
        String price2 = "$9.99";
        double price1Value = Double.parseDouble(price1.replace("$", ""));
        double price2Value = Double.parseDouble(price2.replace("$", ""));
        double total = price1Value + price2Value;
        System.out.println(total);

        //Misah nomor NIM menjadi tahun, kodeProdi, nomorUrut
        System.out.print("Masukkan NIM \t= ");
        String NIM = scanner.nextLine();

        if(NIM.length() < 8){
            System.out.println("NIM anda Salah");
        }
        else{
            String tahun = NIM.substring(0,4);
            String kodeProdi = NIM.substring(4,6);
            String nomorUrut = NIM.substring(6);

            System.out.println("Tahun Masuk \t= " + tahun);
            System.out.println("kode Prodi \t\t= " + kodeProdi);
            System.out.println("Nomor urut \t\t= " + nomorUrut);
        }


    }

    static void formAddEmployee(String firstName, String lastName, String gmail, String age, String salary, String department){

        int umur = Integer.parseInt(age);
        int gaji = Integer.parseInt(salary);

        System.out.println("Nama " + firstName + " " +lastName + " dengan umur " + umur + " dan gaji " + gaji + " berada pada departemen " + department);
        System.out.println("email " + firstName + " " + lastName + " adalah " + gmail);
    }
}
