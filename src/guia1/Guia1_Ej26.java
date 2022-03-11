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
public class Guia1_Ej26 {
   public static void main(String...arg){
   
       int M[][]={{1,26,36,47,5,6,72,81,95,10},
           {11,12,13,21,41,22,67,20,10,61},
           {56,78,87,90,9,90,17,12,87,67},
           {41,87,24,56,97,74,87,42,64,35},
           {32,76,79,1,36,5,67,96,12,11},
           {99,13,54,88,89,90,75,12,41,76},
           {67,78,87,45,14,22,26,42,56,78},
           {98,45,34,23,32,56,74,16,19,18},
           {24,67,97,46,87,13,67,89,93,24},
           {21,68,78,98,90,67,12,41,65,12}};
       
       int P[][]={{98,45,34},{24,67,97},{21,68,78}};
       int ff=0;
       int cc=0;
       int fencontrada=-1;
       int cencontrada=-1;
    
       general:
       for(int f=0;f<M.length;f++){
       
           for(int c=0;c<M[f].length;c++){
           
               if(M[f][c]==P[0][0]){
               
                   fencontrada=f;
                   cencontrada=c;
                   
                   grande:
                   for(int i=0;i<P.length;i++){
                   
                       for(int j=0;j<P[i].length;j++){
                       
                           if(M[f][c]==P[i][j]){
                           
                               c++;
                               if(c>=M[f].length){
                               
                                   
                                   c=cencontrada;
                                   
                                   
                               }
                           }else {
                           
                               fencontrada=-1;
                                    cencontrada=-1;
                                    break grande;
                               
                           }
                       }
                       f++;
                       c=cencontrada;
                        if(f>=M.length){
                               
                                   
                                   
                                    break general;
                                   
                               }
                       
                   }
                   
               }
           
           }
           
       }
       
       System.out.println("fila "+fencontrada);
       System.out.println("columna "+cencontrada);
   }

   
               
          
}
