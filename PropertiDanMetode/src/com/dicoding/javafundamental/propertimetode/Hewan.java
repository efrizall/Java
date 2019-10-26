package com.dicoding.javafundamental.propertimetode;

class Hewan {

    //properti atau fields
    //inisialisasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    //inisiasi melalui konstruktor
    int umur;

    //konstruktor dengan parameter
    Hewan(int umurParam){
        this.umur = umurParam;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat ...");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan ...");
    }

    void makan(){
        System.out.println("Makan dengan mulut ...");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    int getUmur(){
        return umur;
    }
}
