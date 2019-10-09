package com.dicoding.javafundamental.operator;

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args){
//        System.out.println("Operasi Penjumlahan");
//        int hasilPenjumlahan = 5 + 1;
//        System.out.println("Hasil 5 + 1 = " + hasilPenjumlahan);
//        System.out.println();
//        System.out.println("Operasi Pengurangan");
//        int hasilPengurangan = 4 - 1;
//        System.out.println("Hasil 4 - 1 = " + hasilPengurangan);
//        System.out.println();
//        System.out.println("Operasi Pengalian");
//        int hasilPengalian = 5 * 5;
//        System.out.println("Hasil 5 * 5 = " + hasilPengalian);
//        System.out.println();
//        System.out.println("Operasi Pembagian");
//        int hasilPembagian = 20 / 2;
//        System.out.println("Hasil 20 / 2 = " + hasilPembagian);
//        System.out.println();
//        System.out.println("Operasi Habis bagi");
//        int hasilSisa = 8 % 2;
//        System.out.println("Hasil 8 % 2 = " + hasilSisa);
//        System.out.println();
//        int hasilSisa2 = 9 % 2;
//        System.out.println("Hasil 9 % 2 = " + hasilSisa2);
//        System.out.println();
        Scanner scanner = new Scanner(System.in);

        // Penjumlahan
        System.out.println("Operasi penjumlahan");
        int a, b, hasil;
        System.out.print("Angka pertama : ");
        a = scanner.nextInt();
        System.out.print("Angka kedua : ");
        b = scanner.nextInt();
        hasil = a + b;
        System.out.println("Hasil : " + hasil);

        // Pengurangan
        System.out.println("Operasi pengurangan");
        System.out.print("Angka pertama : ");
        a = scanner.nextInt();
        System.out.print("Angka kedua : ");
        b = scanner.nextInt();
        hasil = a - b;
        System.out.println("Hasil : " + hasil);

        // Perkalian
        System.out.println("Operasi perkalian");
        System.out.print("Angka pertama : ");
        a = scanner.nextInt();
        System.out.print("Angka kedua : ");
        b = scanner.nextInt();
        hasil = a * b;
        System.out.println("Hasil : " + hasil);

        // Pembagian
        System.out.println("Operasi pembagian");
        System.out.print("Angka pertama : ");
        a = scanner.nextInt();
        System.out.print("Angka kedua : ");
        b = scanner.nextInt();
        hasil = a / b;
        System.out.println("Hasil : " + hasil);

        // Hasil bagi
        System.out.println("Operasi hasil bagi");
        System.out.print("Angka pertama : ");
        a = scanner.nextInt();
        System.out.print("Angka kedua : ");
        b = scanner.nextInt();
        hasil = a % b;
        System.out.println("Hasil bagi : " + hasil);
    }
}
