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
public class ejerciciorecursivo {
    
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int numero1;
        System.out.println("Numero minimo ?");
        numero1=sc.nextInt();
        int numero2;
        System.out.println("Numero maximo ?");
        numero2=sc.nextInt();
        
        
        int suma;
        suma=leernumeros(numero1, numero2);
        System.out.println("La suma es "+suma);
        
    }
    
    
    private static int leernumeros(int num,int num2){
        int v1;
        if(num>num2){
            v1=num;
            num2=num;
            num=v1;
            
            
        
        
        
    
        }
        
        
        
        
    
    if(num==num2){
    
    
    return num2;
    
    
    }
    else if(num2>num){
    
    return num2+leernumeros(num, num2-1);
    
    }
    
    return -1;
    }
    
    
    
    
    
    
    
}
