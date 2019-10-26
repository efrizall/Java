package com.dicoding.javafundamental.accessmodifier;

public class KelasA {

    private int memberA = 5;

    private int functionA(){
        return memberA;
    }

    int functionB(){
        //pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}
