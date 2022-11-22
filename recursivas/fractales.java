/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2.recursivas;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class fractales {
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado inicial");
    int lado=sc.nextInt();
    int perimetro_total=ContarPerimetroFracta(lado);
        System.out.println("Perimetro total"+perimetro_total);
    
    
    
    
    }

    private static int ContarPerimetroFracta(int lado) {
        if(lado==0){
        
        return 0;
        
        }
        else if(lado==1){
        
        return 4*lado;
        
        }
        else if(lado>1){
        return 4*lado+4*ContarPerimetroFracta(lado/2);
        
        
        }
        return -1;
    }
    
    
    
    
    
    
    
    
    
    
}
