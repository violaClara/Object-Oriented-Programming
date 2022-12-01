/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bahanbakarmobil;

/**
 *
 * @author DELL
 */
public abstract class Mobil {
    public String namaMobil;
    public double jarak;
    public double kecepatan;

    public Mobil(String namaMobil,double jarak, double kecepatan) {
        this.namaMobil=namaMobil;
        this.jarak = jarak;
        this.kecepatan = kecepatan;
    }
    
    
    public abstract double hitungBahanBakar();
    
    public double hitungWaktuTempuh(){
        double waktuTempuh=this.jarak/this.kecepatan;
        return waktuTempuh;
    }
    
    public void tampilkanPerhitungan(){
        System.out.println("Bahan bakar yang dibutuhkan mobil "+this.namaMobil+": "+this.hitungBahanBakar()+ "liter");
        System.out.println("Waktu tempuh yang dibutuhkan mobil "+this.namaMobil+": "+this.hitungWaktuTempuh()+" jam");
    }
    
}
