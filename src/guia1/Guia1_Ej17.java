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
public class Guia1_Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad=0;
        Scanner lector=new Scanner(System.in);
        cantidad=lector.nextInt();
        for (int cabeza=0;cabeza<cantidad;cabeza++){
        
            System.out.print("*");
        }
        System.out.println("");
        for(int fila=0;fila<cantidad;fila++){
        
            System.out.print("*");
            for(int i=0;i<cantidad-2;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
            
        }
        
        for (int cabeza=0;cabeza<cantidad;cabeza++){
        
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
