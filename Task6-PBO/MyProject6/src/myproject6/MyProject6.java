/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject6;

/**
 *
 * @author DELL
 */
public class MyProject6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass m1= new MyClass(10,20);
        m1.output();
        m1.w=44;
        
        MyClass m2= new MyClass();
        m2.x=4;
        m2.y=3;
        m2.output();
        
        MyClass m3= new MyClass(4);
        m3.output();
        
        Karyawan k1= new Karyawan("budi","K35689","Surabaya",4000);
        k1.tampilData();
    }
    
}
