/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author DELL
 */
public abstract class BangunRuang {
    public abstract double hitungvolume();
    public abstract double hitungLuasPermukaan();
    
    public void tampilHasil(){
        System.out.println("volumenya "+this.hitungvolume());
        System.out.println("Luas permukaannya: "+this.hitungLuasPermukaan());
    }
}
