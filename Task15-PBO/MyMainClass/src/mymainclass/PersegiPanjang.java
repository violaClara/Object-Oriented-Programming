/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymainclass;

/**
 *
 * @author DELL
 */
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    private double luas;
    
    void setPanjang(double p){
        if (p>0){
            this.panjang=p;
        } else{
            System.out.println("nilai tidak valid");
            System.exit(0);
        }
        
    }

    void setLebar(double l){
        if (l>0){
         this.lebar=l;
        } else{
            System.out.println("nilai tidak valid");
            System.exit(0);
        }
       
    }
    
    double getPanjang(){
        return this.panjang;
    }
    
    double getLebar(){
        return this.lebar;
    }
    
    double hitungLuas(){
        this.luas=this.panjang*this.lebar;
        return this.luas;
    }
    
}
