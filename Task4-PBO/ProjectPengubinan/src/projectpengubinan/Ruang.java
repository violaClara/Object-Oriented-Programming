/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author DELL
 */
public class Ruang {
        // panjang ruang 	
    int panjang;
    // lebar ruang
    int lebar;
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
        
        // panjang dari persegi panjang diambil dari panjang ruang
        p.panjang = this.panjang;
        // lebar dari persegi panjang diambil dari lebar ruang
        p.lebar = this.lebar;
        
        // hitung luasnya
        return p.hitungLuas();
    }

}
