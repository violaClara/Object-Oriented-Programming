/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author DELL
 */
public class Lingkaran extends BangunDatar implements Simetri,Keliling{
    public double jari;

    @Override
    public double hitungLuas() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double luas=Math.PI*Math.pow(this.jari, 2);
        return luas;
    }

    @Override
    public double hitungKeliling() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double keliling= Math.PI*(2*this.jari);
        return keliling;
    }

    @Override
    public double hitungSimLipat() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double hitungSimPutar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Luasnya: "+this.hitungLuas());
        //super.tampilHasil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Kelilingnya: "+this.hitungKeliling());
        System.out.println("Simetri Lipat: "+this.hitungSimLipat());
        System.out.println("Simetri putar: "+this.hitungSimPutar());
    }
    
    
    
    
    
    
    
    
    
    
}
