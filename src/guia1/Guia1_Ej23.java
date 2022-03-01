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
public class Guia1_Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][]=new int[4][4];
        System.out.println("Matriz Original");
        rellenarMatriz(matriz);
        //mostrarTranspuesta(new int [][]{{5,-2,8},{7,1,0},{4,-7,-6}});
        System.out.println("Su Transpuesta");
                
        mostrarTranspuesta(matriz);
    }
    
    
     public static void rellenarMatriz(int lista[][]){
    
        int numero =0; 
        for(int f=0;f<lista.length;f++){
        
            for(int c=0;c<lista[f].length;c++){
            
            numero=(int) (Math.random() * 1000);
            lista[f][c]=numero;
            System.out.print(" "+numero);
            
            }
            System.out.println("");
           
           
        }
                
    }
     
     public static void mostrarTranspuesta(int lista[][]){
    
        
        for(int f=0;f<lista.length;f++){
        
            for(int c=0;c<lista[f].length;c++){
            
            System.out.print(" "+lista[c][f]);
            
            }
            System.out.println("");
           
           
        }
                
    }
}
