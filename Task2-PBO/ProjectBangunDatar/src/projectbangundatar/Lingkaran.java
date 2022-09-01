/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author DELL
 */
public class Lingkaran {
    //atribut
    int jejari;
    
    void hitungLuas(){
        double luas=3.14*this.jejari*this.jejari;
        System.out.println("Luas lingkaran "+this.jejari+": "+luas);
    }
    
    void hitungKeliling(){
          double keliling=3.14*(this.jejari*2);
        System.out.println("Keliling lingkaran "+this.jejari+": "+keliling);
    }
    
    
}
