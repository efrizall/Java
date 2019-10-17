/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author PC 205-06
 */
public class contohOverLoading {
    public void jumlah(int a, int b){
        System.out.println("Jumlah 2 angka : " + a + " + " + b + " = " + (a+b));
    }
    
    public void jumlah(int a, int b, int c){
        System.out.println("Jumlah 3 angka : " + a + " + " + b + " + " + c + " = " + (a+b+c));
    }
    
    public void jumlah(double a, int b){
        System.out.println("Jumlah 2 angka : " + a + " + " + b + " = " + (a+b));
    }
    
    public void jumlah(int b, double a){
        System.out.println("Jumlah 2 angka : " + a + " + " + b + " = " + (a+b));
    }
}
