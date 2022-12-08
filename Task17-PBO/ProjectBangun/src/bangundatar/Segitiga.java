/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author DELL
 */
public class Segitiga extends BangunDatar {
    public double a;
    public double t;
 
    @Override
    public double hitungLuas() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double luas= (this.a*this.t)/2;
        return luas;
    }
    
     @Override
    public void tampilHasil() {
        System.out.println("Luasnya: "+this.hitungLuas());
        //super.tampilHasil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
      
    }
}
