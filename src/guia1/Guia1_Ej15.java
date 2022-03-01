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
public class Guia1_Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nro=-1;
        int suma=0;
        Scanner lector=new Scanner(System.in);
        
        for(int i=0;i<20;i++){
            System.out.print("Ingrese un nro");
            nro=lector.nextInt();
            System.out.println("");
        
            if(nro>0){
            
                suma+=nro;
            }
            if(nro==0){
                System.out.println("Se capturó el nro cero");
                break;
            }
        }
        
        System.out.println("La suma es "+suma);
    }
    
}
