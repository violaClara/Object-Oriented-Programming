/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan3;

/**
 *
 * @author DELL
 */
public class Ruang {
    int panjang;
    int lebar;
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
               
        // hitung luasnya
        return PersegiPanjang.perkalian(this.panjang, this.lebar);
    }

}
