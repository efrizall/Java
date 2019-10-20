package com.dicoding.javafundamental.percabangann;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int input;
        String tambah = "Output : ";

        System.out.print("Input : ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println(tambah + "Satu");
                break;
            case 2:
                System.out.println(tambah + "Dua");
                break;
            case 3:
                System.out.println(tambah + "Tiga");
                break;
            case 4:
                System.out.println(tambah + "Empat");
                break;
            case 5:
                System.out.println(tambah + "Lima");
                break;
            case 6:
                System.out.println(tambah + "Enam");
                break;
            case 7:
                System.out.println(tambah + "Tujuh");
                break;
            case 8:
                System.out.println(tambah + "Delapan");
                break;
            case 9:
                System.out.println(tambah + "Sembilan");
                break;
            default:
                System.out.println("Input --> 1 s/d 9");

        }
    }
}
