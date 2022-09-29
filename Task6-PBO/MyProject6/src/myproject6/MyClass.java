/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject6;

/**
 *
 * @author DELL
 */
public class MyClass {
    int x; 
    int y;
    int w;
    
    void output(){
        int hasil= this.x+this.y;
        System.out.println("Hasil penjumlahan: "+ hasil);
    }
    
    MyClass(int a, int b){
        this.x=a;
        this.y=b;
    }

    MyClass() {
        
    }
    
    MyClass(int a){
        this.x=a;
    }
    
}
