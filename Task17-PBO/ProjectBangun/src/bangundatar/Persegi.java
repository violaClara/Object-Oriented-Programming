/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author DELL
 */
public class Persegi extends bangundatar.BangunDatar implements Simetri,Keliling{
    public double sisi;
    public double hitungLuas(){
        double luas= this.sisi * this.sisi;
        return luas;
    }


    public double hitungKeliling() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       double keliling= 4*this.sisi;
       return keliling;
    }
    
       @Override
    public double hitungSimLipat() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 4;
    }

    @Override
    public double hitungSimPutar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 4;
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
