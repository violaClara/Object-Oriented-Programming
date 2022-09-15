/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author DELL
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double luasBangunKompleks1= 2*Lingkaran.hitungLuas(21)+Persegi.hitungLuas(42);
        System.out.println("luas bangun 1: "+luasBangunKompleks1);
        
        
       double luasBangunKompleks2= Lingkaran.hitungLuas(14)/2-Lingkaran.hitungLuas(7);
       System.out.println("luas bangun 2: "+luasBangunKompleks2);
    }
    
}
