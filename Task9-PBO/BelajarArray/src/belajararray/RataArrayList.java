/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajararray;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RataArrayList {
    void inputArrayList(){
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan jumlah bilangan: ");
        int n= input.nextInt();
       
        ArrayList<Integer> bilangan=new ArrayList<>();
        for(int i=0; i<n;i++){
            System.out.println("Masukkan angka: ");
            bilangan.add(input.nextInt());
        }
        
        System.out.println("Rata2: "+hitungRataArrayL(bilangan));
        
        System.out.println("Nilai max: "+Collections.max(bilangan));
        System.out.println("Nilai min: "+Collections.min(bilangan));
        
    }
    
    double hitungRataArrayL(ArrayList<Integer> data){
        double sum=0;
        
        for(int angka:data){
            sum=sum+angka;
        }
        
        return sum/data.size();
        
    }
}
