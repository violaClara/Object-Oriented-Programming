/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author DELL
 */
public class Ubin {
    
    // panjang ubin
    int panjang;
    // lebar ubin
    int lebar;
    
    // menghitung luas sebuah ubin
    int hitungLuas(){
        PersegiPanjang u=new PersegiPanjang();
        u.panjang= this.panjang;
        u.lebar=this.lebar;
        
        return u.hitungLuas();
    }

}
