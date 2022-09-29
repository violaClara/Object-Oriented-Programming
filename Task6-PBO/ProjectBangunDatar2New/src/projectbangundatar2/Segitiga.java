/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar2;

/**
 *
 * @author DELL
 */
public class Segitiga {
    double alas;
    double tinggi;
    
    

    public Segitiga(double a, double t) {
        this.alas=a;
        this.tinggi= t;
    }
    
    void luasSegitiga(){
        System.out.println((alas*tinggi)/2);
    }
    
}
