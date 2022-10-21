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
public class RataClass {
    
    void inputData(){
        Scanner input= new Scanner(System.in);
        System.out.print("Banyak data? ");
        int n= input.nextInt();
        
        int[] bilangan2=new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Masukkan data: ");
            bilangan2[i]= input.nextInt();
        }
        
        System.out.println(hitungRerata(bilangan2)); 
        
    }
    
    double hitungRerata(int [] data){
        double sum=0;
        for (int bil: data){
            sum=bil+sum;
        }
        return sum/data.length;
    }
}
