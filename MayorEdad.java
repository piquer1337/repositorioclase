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
public class MayorEdad {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean mayor;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe la edad del usuario");
        
        int edad;
        
        edad=sc.nextInt();
        
        mayor=esMayorEdad(edad);
        if(mayor==true){
            System.out.println("Eres mayor de edad");
        
        }
        
        else{
            System.out.println("Eres menor de edad");
        }
        
    }
    public static boolean esMayorEdad(int a) {
        boolean mayor;
        if(a>=18)
        {
        mayor=true;
        }
        else{
        mayor=false;
        }
        
    
    return true;
}
    
    
    
    
    
    
    
    
}
