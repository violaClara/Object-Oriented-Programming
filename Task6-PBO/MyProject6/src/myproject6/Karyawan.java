/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject6;

/**
 *
 * @author DELL
 */
public class Karyawan {
    String nama;
    String id;
    String alamat;
    int gaji;

    Karyawan(String a, String b, String c, int d) {
        this.nama=a;
        this.id=b;
        this.alamat=c;
        this.gaji=d;
    }
    
    void tampilData(){
        System.out.println("nama: "+this.nama);
        System.out.println("id: "+this.id);
        System.out.println("alamat: "+this.alamat);
        System.out.println("gaji: "+this.gaji);
    }
    
    
    
}
