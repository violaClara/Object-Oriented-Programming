/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author DELL
 */
public class Persegi extends bangundatar.BangunDatar {
    public double sisi;
    public double hitungLuas(){
        double luas= this.sisi * this.sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       double keliling= 4*this.sisi;
       return keliling;
    }
    
    

}
