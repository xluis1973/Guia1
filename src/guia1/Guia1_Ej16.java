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
public class Guia1_Ej16 {
    
    public static void main(String...arg){
        
         String cadena=null;
         int correctas=0;
         int incorrectas=0;
         Scanner lector=new Scanner(System.in);
         cadena=lector.next();
        
         while(!cadena.equals("&&&&&")){
         
             if(cadena.length()==5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")){
             
                 correctas++;
             } else{
             
                 incorrectas++;
                 
             }
             
             cadena=lector.next();
             
         }
         
         System.out.println("Cantidad de cadenas correctas "+correctas);
         System.out.println("Cantidad de cadenas incorrectas "+incorrectas);
    
    }
   
}
