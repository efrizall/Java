/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author PC105-10
 */
public class belajarclass {

    public static void main(String[] args) {
        mobil sedan = new mobil();
        
        sedan.isiJenis("City");
        sedan.isiMerk("Honda");
        sedan.isiCc(500);
        
        System.out.println("Jenis mobil " + sedan.perolehJenis());
        System.out.println("Merk mobil " + sedan.perolehMerk());
        System.out.println("CC mobil " + sedan.perolehCc());
    }
    
}
