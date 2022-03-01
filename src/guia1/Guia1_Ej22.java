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
public class Guia1_Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lista[]=new int[1000];
        rellenarVector(lista);
        recorrer(lista);
        
        
    }
    
    public static void recorrer(int lista[]){
    
        int uno=0,dos=0,tres=0,cuatro=0,cinco=0;
        int cantidad=0;
        for(int i=0;i<lista.length;i++){
        
            cantidad=contarDigitos(lista[i]);
            switch(cantidad){
            
                case 1:uno++;break;
                case 2:dos++;break;
                case 3:tres++;break;
                case 4:cuatro++;break;
                case 5:cinco++; break;
                    
            }
        }
        System.out.println("una "+uno);
        System.out.println("dos "+dos);
        System.out.println("tres "+tres);
        System.out.println("cuatro "+cuatro);
        System.out.println("cinco "+cinco);
    }
    
    public static int contarDigitos(int nro){
    
       
        int cantidad=1;
      
        
        while(nro>=10){
        
            nro=nro/10;
            cantidad++;
        }
        return cantidad;
    }
    
     public static void rellenarVector(int lista[]){
    
        int numero =0; 
        for(int i=0;i<lista.length;i++){
        
            numero=(int) (Math.random() * 1000);
            lista[i]=numero;
            System.out.println("-"+numero);
        }
                
    }
}
