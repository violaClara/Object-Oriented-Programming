/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject1;

/**
 *
 * @author DELL
 */
public class Persegi {
    
    //attribut
    int sisi;
    
    public static void main(String[] args) {
        Persegi p1= new Persegi();
        p1.sisi=5;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        Persegi p2= new Persegi();
        p2.sisi=8;
        p2.hitungLuas();
        p2.hitungKeliling();
        
         Persegi p3= new Persegi();
        p3.sisi=13;
        p3.hitungLuas();
        p3.hitungKeliling();
        
    }
    
    //method
    void hitungLuas(){
        int luas= sisi*sisi;
        System.out.println("Luasnya adalah "+luas);
    }
    void hitungKeliling(){
        int keliling= this.sisi*4;
        System.out.println("Kelilingnya adalah: "+keliling);
    }
    
}

