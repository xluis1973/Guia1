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
public class Guia1_Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double euro=0;
        String moneda=null;
        Scanner lector =new Scanner(System.in);
        System.out.println("Ingrese cantidad de Euros");
        euro=lector.nextDouble();
        System.out.println("Ingrese moneda (dolar,yen,libra");
        moneda=lector.next();
        cambiarA(euro,moneda);
        
    }
    
    public static void cambiarA(double euros,String moneda){
    
        if(moneda.equalsIgnoreCase("dolar")){
        
            System.out.println("Son "+euros*1.28611+"Dólares");
        }else if(moneda.equalsIgnoreCase("yen")){
            System.out.println("Son "+euros*129.852+"Yenes");
        } else if(moneda.equalsIgnoreCase("libra")){
        
            System.out.println("Son "+euros*0.86+"Libras");
        }else {
        
            System.out.println("Desconozco esa moneda");
        }
    }
    
}
