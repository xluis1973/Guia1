/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Guia1_Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nro=0;
        Scanner lector=new Scanner(System.in);
        System.out.print("Ingrese un nro entre 1 y 20");
        nro=lector.nextInt();
        
        while(!(nro>=1 && nro <=20)){
        
            System.out.println("el nro debe estar entre 1 y 20");
            nro=lector.nextInt();
            
        }
        
        int nro2=lector.nextInt();
        
        while(!(nro2>=1 && nro2 <=20)){
        
            System.out.println("el nro debe estar entre 1 y 20");
            nro=lector.nextInt();
            
        }
        
        int nro3=lector.nextInt();
        
        while(!(nro3>=1 && nro3 <=20)){
        
            System.out.println("el nro debe estar entre 1 y 20");
            nro=lector.nextInt();
            
        }
        
        int nro4=lector.nextInt();
        
        while(!(nro4>=1 && nro4 <=20)){
        
            System.out.println("el nro debe estar entre 1 y 20");
            nro=lector.nextInt();
            
        }
        
        System.out.println("");
        System.out.print(nro);
        for(int i=0;i<nro;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(nro2);
        for(int i=0;i<nro2;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(nro3);
        for(int i=0;i<nro3;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print(nro4);
        for(int i=0;i<nro4;i++){
            System.out.print("*");
        }
        
    }
    
}
