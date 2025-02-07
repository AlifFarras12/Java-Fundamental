package com.juaracoding;
import java.util.*;
import java.util.Collections;

public class CollectionJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("LandCruiser");
        cars.add("Ford");
        cars.set(0, "Mustang");
        System.out.println(cars.get(1));
        System.out.println(cars);
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i.toUpperCase());
        }
        int size = cars.size();
        System.out.println(size);
        cars.clear();
        System.out.println(cars);

        // input angka dalam bentuk string, looping menghasilkan number
        // "100","200","300"
        ArrayList<String> angka = new ArrayList<>();
        System.out.print("Jumlah data yang mau di input = ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("masukkan angka : ");
            String price = scanner.nextLine();
            angka.add(price);
        }
        int total = 0;
        for (String i : angka){
            int number = Integer.parseInt(i);
            total += number;
        }
        System.out.println("Total = " + total);

        // HashSet
        HashSet List = new HashSet<>();
        List.add("F");
        List.add("B");
        List.add("D");
        List.add("G");
        List.add("F");
        List.add("A");
        System.out.println(List);
        System.out.println("");

        //HashMap
        HashMap<String,String> kota = new HashMap<>();
        kota.put("Indonesia", "Jakarta");
        kota.put("Malaysia", "Kuala Lumpur");
        kota.put("Thailand", "Bangkok");
        Collections.sort(kota);
        System.out.println(kota);
        for(String i : kota.keySet()){
            System.out.println(i + " = " + kota.get(i));
        }

    }
}
