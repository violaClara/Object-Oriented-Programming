/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perusahaan;

/**
 *
 * @author DELL
 */
public class Karyawan {
    String NIK;
    String nama;
    private double gajiPokok=3000000;
    private double gajiTunjangan;
    private int tahunKerja;


    public void setGajiTunjangan(double gajiTunjangan) {
        if(gajiTunjangan>0){
         this.gajiTunjangan = gajiTunjangan;
        }else{
         System.out.println("Gaji tunjangan tidak valid");
        }
       
    }
    
      public void setGajiTunjangan() {
       
    }

    public void setTahunKerja(int tahunKerja) {
        if(tahunKerja>0){
            this.tahunKerja = tahunKerja;
        }else{
            System.out.println("Tahun tidak valid");
        }
        setGajiTunjangan();
        
    }

    public int getTahunKerja() {
        return tahunKerja;
    }
    
 
    public double getGajiTunjangan() {
        return this.gajiTunjangan;
    }
    
    double totalGaji(){
        return this.gajiPokok+this.gajiTunjangan;
    }


    
    
    
    
    
    
    
    
}
