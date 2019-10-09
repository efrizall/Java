package com.dicoding.javafundamental.basic;

import java.util.Scanner;

public class belajarString {
    public static void main(String[] args){
        // mengetahui panjang string
        String efrizal = "efrizal";
        int length = efrizal.length();
        System.out.println("karakter string ada " + length);

        // mengambil karakter dari sebuah string
        int posisi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Posisi ke : ");
        posisi = scanner.nextInt();
        posisi--;
        char result = efrizal.charAt(posisi);
        System.out.println("huruf : " + result);
    }
}
