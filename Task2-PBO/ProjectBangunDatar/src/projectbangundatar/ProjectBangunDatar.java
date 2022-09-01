/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author DELL
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat obyek persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        A.panjang = 10;
        A.lebar = 7;
        
        // menghitung luas dan keliling dari A
        A.hitungLuas();
        A.hitungKeliling();
        
        // membuat obyek persegi panjang B
        PersegiPanjang B = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        B.panjang = 14;
        B.lebar = 9;
        
        // menghitung luas dan keliling dari B
        B.hitungLuas();
        B.hitungKeliling();
        
        PersegiPanjang C= new PersegiPanjang();
        C.panjang=17;
        C.lebar=8;
        
        C.hitungLuas();
        C.hitungKeliling();
        
        PersegiPanjang D= new PersegiPanjang();
        D.panjang=26;
        D.lebar=14;
        
        D.hitungLuas();
        D.hitungKeliling();
        
        //menghitung luas dan lingkaran L1
        Lingkaran L1= new Lingkaran();
        L1.jejari=6;
        L1.hitungLuas();
        L1.hitungKeliling();
        
         //menghitung luas dan lingkaran L2
        Lingkaran L2= new Lingkaran();
        L2.jejari=12;
        L2.hitungLuas();
        L2.hitungKeliling();
        
        
        
        

    }
    
}
