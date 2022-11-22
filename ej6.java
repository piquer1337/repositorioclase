/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class ej6 {
    
    public static void main(String[] args) {
        double prueba;
        double iva;
        Scanner sc= new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe el precio que quieras añadirle el IVA");
        prueba=sc.nextDouble();
        iva=precioCONIVA(prueba);
        
        System.out.println("El precio sube a "+iva);
        }
        
        
        
    }
    
public static double precioCONIVA(double precio){
    double resultado;
    double calculo = 0;
    calculo=precio*1.21;
    
    return calculo;
    
    
    
    
}
}