/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar2;

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
        PersegiPanjang pp1= new PersegiPanjang();
        System.out.println(pp1.luasPersegi(10, 5));
        System.out.println(pp1.luasPersegi(3.6, 8));
        System.out.println(pp1.luasPersegi(6, 8.3));
        System.out.println(pp1.luasPersegi(5.6, 8.8));
        System.out.println(pp1.kelilingPersegi(10, 5));
        System.out.println(pp1.kelilingPersegi(3.6, 8));
        System.out.println(pp1.kelilingPersegi(6, 8.3));
        System.out.println(pp1.kelilingPersegi(5.6, 8.8));
        
        Persegi p1= new Persegi();
        System.out.println(p1.luasPersegi(4.5));
        System.out.println(p1.luasPersegi(7));
        System.out.println(p1.kelilingPersegi(4.5));
        System.out.println(p1.kelilingPersegi(7));
        
        Lingkaran l1= new Lingkaran();
        System.out.println(l1.luasLingkaran(5));
        System.out.println(l1.luasLingkaran(7.4));
        System.out.println(l1.kelilingLingkaran(5));
        System.out.println(l1.kelilingLingkaran(7.4));
        
        Segitiga s1= new Segitiga();
        System.out.println(s1.luasSegitiga(8, 10));
        System.out.println(s1.luasSegitiga(8, 11.5));
        System.out.println(s1.luasSegitiga(12.2, 9));
        System.out.println(s1.luasSegitiga(13.9, 20.7));
        

    }
    
}
