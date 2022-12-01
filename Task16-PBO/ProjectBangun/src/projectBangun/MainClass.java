/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectBangun;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author DELL
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi p1=new Persegi();
        p1.sisi=3;
        p1.tampilHasil();
        
        Lingkaran l1=new Lingkaran();
        l1.jari=14;
        l1.tampilHasil();
        
        PersegiPanjang pp1=new PersegiPanjang();
        pp1.lebar=2;
        pp1.panjang=3;
        pp1.tampilHasil();
        
        Balok b1=new Balok();
        b1.lebar=2;
        b1.panjang=3;
        b1.tinggi=4;
        b1.tampilHasil();
        
        Bola bl1=new Bola();
        bl1.jari=14;
        bl1.tampilHasil();
        
        Tabung tb1=new Tabung();
        tb1.jari=14;
        tb1.tinggi=5;
        tb1.tampilHasil();
        
        
    }
    
}
