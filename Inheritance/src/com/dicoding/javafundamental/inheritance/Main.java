package com.dicoding.javafundamental.inheritance;

public class Main {

    public static void main(String[] args) {
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("-----------------------");

        Kucing kucing = new Kucing(); //memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("-----------------------");

        hewan.makan(); //kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("-----------------------");

        Kucing meow = new Kucing("Ocicat", "Tropis");
        Kucing puss = new Kucing("Ocicat", "Subtropis");
        Kucing popo = new Kucing("Anggora", "Subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

    }
}
