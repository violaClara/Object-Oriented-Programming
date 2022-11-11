/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan13;

/**
 *
 * @author DELL
 */
public class Latihan13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassA ob1= new ClassA();
        ob1.x=2;
        ob1.y=4;
        ob1.myMethod1();
        
        ClassB ob2= new ClassB();
        ob2.x=6;
        ob2.y=12;
        ob2.z=24;
        ob2.myMethod1();
        
        ClassC ob3= new ClassC();
        ob3.x=7;
        ob3.y=14;
        ob3.z=21;
        ob3.c=28;
        ob3.myMethod1();
        ob3.myMethod2();
        
    }
    
}
