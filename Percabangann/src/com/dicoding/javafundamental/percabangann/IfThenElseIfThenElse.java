package com.dicoding.javafundamental.percabangann;

import java.util.Scanner;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilaiUjian;
        char indeksPrestasi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai anda : ");
        nilaiUjian = scanner.nextInt();

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }
        System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
    }
}
