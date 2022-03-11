/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Arrays;
import java.util.Collections;
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
        //Visualizados en orden descendente.
        for(int i=99;i>-1;i--){
        
            System.out.println(lista[i]);
        }
        
        
    }
 
    public static void rellenaVector(int lista[]){
    
        int nro=1;
        int contador=0;
        for(int i=0;i<lista.length;i++){
        
            lista[i]=nro++;
        }
        
    }
    
    
}
