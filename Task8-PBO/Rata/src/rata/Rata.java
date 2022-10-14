/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rata;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Rata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // TODO code application logic here
        Scanner input= new Scanner(System.in);
        String ans;
        float sum=0;
        //ans="y";
        float loop=1;
        
        do{
            
            System.out.println("Masukkan bil bulat: ");
            float tmp=input.nextFloat();
            sum=tmp+sum;
            System.out.print("Entri lagi?: ");
            ans=input.next();
            loop=loop+1;
        }
        while("y".equals(ans));
        
        float rata2= sum/(loop-1);
        System.out.println("rata: "+rata2);  
    }}
   
    
    
   
