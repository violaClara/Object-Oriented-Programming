/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perusahaan;

/**
 *
 * @author DELL
 */
public class Perusahaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A karyawan1=new A();
        karyawan1.nama="Wahyu";
        karyawan1.NIK="K234844";
        karyawan1.setTahunKerja(11);
        System.out.println("Total gaji atas nama "+karyawan1.nama+" dengan NIK "+karyawan1.NIK+" adalah "+karyawan1.totalGaji());
      
        
        B karyawan2= new B();
        karyawan2.nama="Oka";
        karyawan2.NIK="K789989";
        karyawan2.setTahunKerja(12);
        System.out.println("Total gaji atas nama "+karyawan2.nama+" dengan NIK "+karyawan2.NIK+" adalah "+karyawan2.totalGaji());
    }
    
}
