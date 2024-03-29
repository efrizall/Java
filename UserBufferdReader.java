package com.dicoding.javafundamental.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferdReader {
    public static void main(String[] args){

        // inisialisasi BufferedReader yang dibantu dengan InputStreamReader
        // agar dapat membaca input dari keyboard
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        System.out.println("Program penjumlahan sangat sederhana");
        int value1 = 0;
        int value2 = 0;

        try{
            System.out.print("Masukkan angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }
        // menambahkan ioException untuk penanganan error input pada BufferedReader
        catch (IOException e){
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya : " + hasil);
    }
}
