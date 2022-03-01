/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author Luis
 */
public class Guia1_Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Matriz Original");
        int matriz[][]={{0,1,4},{-1,0,6},{-4,-6,0}};
        int transpuesta[][]=obtenerTranspuesta(matriz);
       
        mostrarTranspuesta(transpuesta);
        
        if(esAntiSimetrica(matriz,transpuesta)){
        
            System.out.println("Es AntiSimetrica");
        } else {
        
            System.out.println("No es Anti simetrica");
        }
       
     
        
    }
    
    
     
     
     public static boolean esAntiSimetrica(int lista[][],int transpuesta[][]){
    
        
        for(int f=0;f<lista.length;f++){
        
            for(int c=0;c<lista[f].length;c++){
            
            System.out.print(" "+lista[c][f]);
        
                    if(!(lista[f][c]+transpuesta[f][c]==0)){
            
                        return false;
                
                        }
            
            
            }
            System.out.println("");
           
           
        }
        return true;
                
    }
     
     public static int[][] obtenerTranspuesta(int lista[][]){
     
         int T[][]=new int[lista.length][lista.length];
         for(int f=0;f<lista.length;f++){
        
            for(int c=0;c<lista[f].length;c++){
            
            
                T[f][c]=lista[c][f];
            
            
            }
            
           
           
        }
     
         return T;
     }
    
     
     public static void mostrarTranspuesta(int lista[][]){
     
         
         for(int f=0;f<lista.length;f++){
        
            for(int c=0;c<lista[f].length;c++){
            
            
                System.out.print(lista[f][c]+" ");
            
            
            }
             System.out.println("");
            
           
           
        }
     
     }
}
