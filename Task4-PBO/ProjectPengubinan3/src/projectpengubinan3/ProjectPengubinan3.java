/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpengubinan3;

/**
 *
 * @author DELL
 */
public class ProjectPengubinan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Ruang A = new Ruang();
        A.panjang = 3;
        A.lebar = 3;
        
        Ruang B = new Ruang();
        B.panjang = 5;
        B.lebar = 2;
        
        Ruang C = new Ruang();
        C.panjang = 4;
        C.lebar = 3;
        
        // hitung luas total ruang dalam m2
        int totalLuasRuang = A.hitungLuas() + B.hitungLuas() + C.hitungLuas();
        
        // hitung luas ubin
        Ubin X = new Ubin();
        X.panjang = 40;
        X.lebar = 60;
        
        // nyatakan luas ubin ke m2
        double luasUbin = X.hitungLuas()/100000.;
        
        // hitung jumlah ubin
        double jumlahUbin = totalLuasRuang/luasUbin;
        System.out.println("Banyaknya ubin yang diperlukan: " + jumlahUbin);
    }
    
}
