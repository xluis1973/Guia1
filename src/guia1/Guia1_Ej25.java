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
public class Guia1_Ej25 {
    public static void main(String arg[]){
    
     int matriz[][]=new int[3][3];   
        
     rellenarMatriz(matriz);
     if(chequearMatriz(matriz)){
         System.out.println("Correcto!!!");
     }else{
     
         System.out.println("Incorrecto!!!");
     }
         
     
    }
    
    public static boolean chequearMatriz(int matriz[][]){
    
        int suma[]=new int[8];
        int x=0;
        
        //suma filas
        for(int f=0;f<matriz.length;f++){
           
            for(int c=0;c<matriz[f].length;c++){
            
                suma[x]=suma[x]+matriz[f][c];
            }
             x++;
        }
        
        //suma columnas
        for(int f=0;f<matriz.length;f++){
            
            for(int c=0;c<matriz[f].length;c++){
            
                suma[x]=suma[x]+matriz[c][f];
            }
            x++;
        }
        
        //Suma diagonal
        
        for(int f=0;f<matriz.length;f++){
            
             suma[x]=suma[x]+matriz[f][f];
            
        }
         
        x++;
        for(int f=2;f >=0;f--){
            
             suma[x]=suma[x]+matriz[f][f];
            
        }
        for(int i=0;i<suma.length;i++){
        
            System.out.println("Sumas "+suma[i]);
        }
        int j=1;
        while (j<suma.length && suma[0]==suma[j]){
        
            j++;
            
        }
        
        return j==8;
        
    }
     public static void rellenarMatriz(int matriz[][]){
    
         Scanner lector=new Scanner(System.in);
        
        for(int i=0;i<matriz.length;i++){
        
            for(int j=0;j<matriz[i].length;j++){
            
                do{
                    System.out.println("Ingrese un nro entre 1 y 9");
                    matriz[i][j]=lector.nextInt();
                    if(matriz[i][j]<1 || matriz[i][j] >9){
                    
                        System.out.println("Nro incorrecto, vuelvo a ingresar");
                    }
                   
                }while(matriz[i][j]<1 || matriz[i][j] >9);
         
            
            }
            
        }
                
    }
    
}
