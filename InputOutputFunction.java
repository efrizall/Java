package com.dicoding.javafundamental.basic;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main (String[] args){

        // inisialisasi awal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");;

        // memasukkan angka pertama
        System.out.print("Masukkan angka pertama : ");
        int value1 = scanner.nextInt();

        // memasukkan angka kedua
        System.out.print("Masukkan angka kedua : ");
        int value2 = scanner.nextInt();

        // menjumlahkan angka pertama dan kedua
        int hasil = value1 + value2;
        System.out.println("Hasil : " + hasil);

    }
}
