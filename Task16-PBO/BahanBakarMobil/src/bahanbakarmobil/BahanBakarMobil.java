/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bahanbakarmobil;

/**
 *
 * @author DELL
 */
public class BahanBakarMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sedan A=new Sedan("A",163,60);
        A.tampilkanPerhitungan();
        
        Sedan B=new Sedan("B",536,65);
        B.tampilkanPerhitungan();
        
        SUV C= new SUV("C",660,57);
        C.tampilkanPerhitungan();
        
        SUV D= new SUV("D",531,62);
        D.tampilkanPerhitungan();
        
        MPV E=new MPV("E",544,64);
        E.tampilkanPerhitungan();
        
        MPV F=new MPV("F",436,53);
        F.tampilkanPerhitungan();
    }
    
}
