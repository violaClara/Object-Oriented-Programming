/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar2;

import javax.swing.text.Highlighter;

/**
 *
 * @author DELL
 */
public class PersegiPanjang {

  
    double panjangD;
    double lebarD;

    
    PersegiPanjang(double a, double b) {
        this.panjangD=a;
        this.lebarD=b;
    }
    
    
    
    void luasPersegiPanjang(){
        System.out.println(panjangD*lebarD);
        
       
    }
    void kelilingPersegiPanjang(){
        System.out.println(2*(panjangD+lebarD)); 
    }
    
    
}
