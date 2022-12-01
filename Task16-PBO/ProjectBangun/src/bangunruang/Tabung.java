/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author DELL
 */
public class Tabung extends bangunruang.BangunRuang {
    public double jari;
    public double tinggi;

    @Override
    public double hitungLuasPermukaan() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double luasPermukaan=2*Math.PI*this.jari*this.tinggi+2*Math.PI*Math.pow(this.jari,2);
        return luasPermukaan;
    }

    @Override
    public double hitungvolume() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double volume=Math.PI*Math.pow(jari, 2)*this.tinggi;
        return volume;
    }
    
    
    
    
}
