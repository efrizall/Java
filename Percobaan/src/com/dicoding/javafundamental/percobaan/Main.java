package com.dicoding.javafundamental.percobaan;

public class Main {

    public static void main(String[] args) {
	    Hewan kucing = new Hewan();
	    Hewan ayam = new Hewan();

	    kucing.namaHewan("Kucing");
	    kucing.beratHewan(20);
	    kucing.jumlahKakiHewan(4);
	    kucing.cetakHewan();

	    ayam.namaHewan("Ayam");
	    ayam.beratHewan(10);
	    ayam.jumlahKakiHewan(2);
	    ayam.cetakHewan();


    }
}
