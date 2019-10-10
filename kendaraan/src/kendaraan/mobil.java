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
public class mobil {
    private String jenis;
    private String merk;
    private int cc;
    
    public void isiJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void isiMerk(String merk){
        this.merk = merk;
    }
    
    public void isiCc(int cc){
        this.cc = cc;
    }
    
    public String perolehJenis(){
        return jenis;
    }
    
    public String perolehMerk(){
        return merk;
    }
    
    public int perolehCc(){
        return cc;
    }
}
