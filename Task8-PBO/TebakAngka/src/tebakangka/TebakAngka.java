/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tebakangka;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TebakAngka {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max=50;
        int min=1;
        int range=max-min+1;
        
        int angkaRandom= (int)((Math.random()*range)+min);
        tebak(angkaRandom);
        
        
    }
    
    static void tebak(int angkaSimpanan){
        Scanner input= new Scanner(System.in);
        int kesempatan=5;
        for(int i=0; i<5;i++){
            
            System.out.println("Kesempatan tersisa: "+kesempatan);
            System.out.print("Tebak angka yang saya miliki: ");
            int answer=input.nextInt();
            kesempatan-=1;
            
            if(answer==angkaSimpanan){
                System.out.println("Tebakan anda benar");
                break;
            }else{
                if(answer<angkaSimpanan){
                    System.out.println("Tebakan anda kurang dari angka sebenarnya");
                } else if(answer>angkaSimpanan){
                    System.out.println("Tebakan anda lebih dari angka sebenarnya");
                }
                if(kesempatan==0){
                    System.out.println("GAME OVER");
                }
            
                
            }
        }
        
    }
    
    
    
}
