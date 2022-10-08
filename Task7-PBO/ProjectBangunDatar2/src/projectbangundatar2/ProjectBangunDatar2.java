/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar2;

import java.util.*;

/**
 *
 * @author DELL
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang=input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar=input.nextDouble();
        
        PersegiPanjang pp0= new PersegiPanjang(panjang, lebar);
        pp0.luasPersegiPanjang();
        pp0.kelilingPersegiPanjang();
        
        
        PersegiPanjang pp1= new PersegiPanjang(10, 5);
        pp1.luasPersegiPanjang();
        pp1.kelilingPersegiPanjang();
        
        PersegiPanjang pp2= new PersegiPanjang(3.6, 8);
        pp2.luasPersegiPanjang();
        pp2.kelilingPersegiPanjang();
        
        PersegiPanjang pp3= new PersegiPanjang(6, 8.3);
        pp3.luasPersegiPanjang();
        pp3.kelilingPersegiPanjang();
        
        PersegiPanjang pp4= new PersegiPanjang(5.6, 8.8);
        pp4.luasPersegiPanjang();
        pp4.kelilingPersegiPanjang();
        
        
        
        
        System.out.print("Masukkan sisi: ");
        double sisi=input.nextDouble();
        Persegi p0= new Persegi(sisi);
        p0.luasPersegi();
        p0.kelilingPersegi();
        
        Persegi p1= new Persegi(5);
        p1.luasPersegi();
        p1.kelilingPersegi();
        
        Persegi p2= new Persegi(4.5);
        p2.luasPersegi();
        p2.kelilingPersegi();
        
        Persegi p3= new Persegi(7);
        p3.luasPersegi();
        p3.kelilingPersegi();
        
        
        
        
        System.out.print("Masukkan jari: ");
        double jari=input.nextDouble();
        Lingkaran l0= new Lingkaran(jari);
        l0.luasLingkaran();
        l0.kelilingLingkaran();
        
        
        Lingkaran l1= new Lingkaran(5);
        l1.luasLingkaran();
        l1.kelilingLingkaran();
        
        Lingkaran l2= new Lingkaran(7.4);
        l2.luasLingkaran();
        l2.kelilingLingkaran();
        
        
        
    
        System.out.print("Masukkan alas: ");
        double alas=input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi=input.nextDouble();
        Segitiga s0= new Segitiga(alas, tinggi);
        s0.luasSegitiga();
        
        Segitiga s1= new Segitiga(8, 10);
        s1.luasSegitiga();
        
        Segitiga s2= new Segitiga(8, 11.5);
        s2.luasSegitiga();
        
        Segitiga s3= new Segitiga(12.2, 9);
        s3.luasSegitiga();
        
        Segitiga s4= new Segitiga(13.9, 20.7);
        s4.luasSegitiga();
        



       
        
        //contoh bisa ternyata hehe.
        
        Segitiga s5= new Segitiga(input.nextDouble(), input.nextDouble());
        s5.luasSegitiga();
        

        

        

    }
    
}
