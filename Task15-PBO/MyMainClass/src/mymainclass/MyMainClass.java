/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mymainclass;

/**
 *
 * @author DELL
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang p1=new PersegiPanjang();
        p1.setPanjang(-50);
        p1.setLebar(20);
        System.out.println("Luas dari persegi panjang dengan p= "+p1.getPanjang()+" dan lebar="+p1.getLebar()+" adalah "+p1.hitungLuas());
    }
    
}
