/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author DELL
 */
public class Bola extends BangunRuang {
    public double jari;

    @Override
    public double hitungLuasPermukaan() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double luasPermukaan=4*Math.PI*Math.pow(this.jari, 2);
        return luasPermukaan;
    }

    @Override
    public double hitungvolume() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double volume=4/3*Math.PI*Math.pow(this.jari, 3);
        return volume;
    }
    
    
    
    
}
