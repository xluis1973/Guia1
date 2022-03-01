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
public class Guia1_Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nroBuscar=0;
        
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese tamaño del arreglo");
        int tamaño=lector.nextInt();
        int lista[]=new int[tamaño];
        rellenarVector(lista);
        
        System.out.println("ingrese nro a buscar");
        nroBuscar=lector.nextInt();
        buscarNro(nroBuscar,lista);
    }
    
    public static void rellenarVector(int lista[]){
    
        int numero =0; 
        for(int i=0;i<lista.length;i++){
        
            numero=(int) (Math.random() * 10);
            lista[i]=numero;
            System.out.println("-"+numero);
        }
                
    }
    
    public static void buscarNro(int nro,int lista[]){
    int veces=0;
        for(int i=0;i<lista.length;i++){
        
            if(nro==lista[i]){
            
                System.out.println("posicion "+i);
                veces++;
            }
        }
        if(veces==0){
        
            System.out.println("nro no encontrado");
        }else {
        
            System.out.println("esta "+veces+ "veces repetido");
        }
        
    }
    
}
