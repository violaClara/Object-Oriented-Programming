/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajararray;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MyClass {
    
    
    void sampleArray(){
        Scanner input=new Scanner(System.in);
        int[] bil=new int[10];
        for (int i=0; i<bil.length;i++){
            System.out.println("Masukkan data: ");
            bil[i]= input.nextInt();
        }
        
        System.out.println("Tampilkan semua: ");
        
        for(int data:bil){
            System.out.print(data+" ");
        }
    }
}
