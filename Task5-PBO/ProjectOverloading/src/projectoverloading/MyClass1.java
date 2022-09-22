/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoverloading;

/**
 *
 * @author DELL
 */
public class MyClass1 {
    void myMethod(){
        System.out.println("Hello");
    }
    
    void myMethod(int x){
        System.out.println("Holla");
    }
    
    void myMethod(int x, int y){
        System.out.println("Hollo");
    }
    
    void myMethod(double x){
        System.out.println("Hilli");
    }
    
    void myMethod(int x, double y){
        System.out.println("Hullo");
    }
    
    String myMethod(int a,int b,int c){
        return "Hello";
    }
    
    void myMethod(int a, int b,double c){
        System.out.println("Holli");
    }

}
