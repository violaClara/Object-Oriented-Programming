/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahanbakarmobil;

/**
 *
 * @author DELL
 */
public class Sedan extends Mobil{

    public Sedan(String namaMobil,double jarak, double kecepatan) {
        super(namaMobil,jarak, kecepatan);
    }

    
    @Override
    public double hitungBahanBakar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double bahanBakar= this.jarak/10;
        return bahanBakar;
    }

   
    
    
    
}
