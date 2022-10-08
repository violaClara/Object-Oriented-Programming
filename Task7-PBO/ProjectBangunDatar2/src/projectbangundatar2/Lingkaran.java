/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar2;

/**
 *
 * @author DELL
 */
public class Lingkaran {
    
    double jari;


    public Lingkaran(double a) {
        this.jari=a;
    }
    
    void luasLingkaran(){
        System.out.println(3.14*Math.pow(jari,2));
    }
    
    void kelilingLingkaran(){
        System.out.println(2*jari*3.14);
    }
    
    
    
}
