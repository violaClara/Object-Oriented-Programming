/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author DELL
 */
public class PersegiPanjang extends BangunDatar{
    public double panjang;
    public double lebar;

    @Override
    public double hitungLuas() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double luas=this.panjang*this.lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double keliling= 2*(this.panjang+this.lebar);
        return keliling;
    }
    
    
    
    
}
