package overloading;

import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        contohOverLoading co = new contohOverLoading();
        
        // int a + int b
        co.jumlah(30, 30);
        
        //int a + int b + int c
        co.jumlah(30, 30, 30);
        
        //double a + int b
        co.jumlah(30, 30);
        
        // int b + double a
        co.jumlah(30, 30);
    }
    
}
