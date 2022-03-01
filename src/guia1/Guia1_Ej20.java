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
public class Guia1_Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lista[]=new int[100];
        rellenaVector(lista);
        for(int i=99;i>-1;i--){
        
            System.out.println(lista[i]);
        }
    }
 
    public static void rellenaVector(int lista[]){
    
        int nro=1;
        int contador=0;
        while(contador<100){
        
            if(esPrimo(nro)){
            
                lista[contador]=nro;
                contador++;
            }
            nro++;
        }
        
    }
    
    public static boolean esPrimo(int nro){
    
        if(nro==1 || nro==2){
        
            return true;
        }
        for(int i=2;i<nro;i++){
        
            if(nro%i==0){
            
                return false;
            }
        }
        return true;
    }
}
