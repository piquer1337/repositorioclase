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
public class echa_correcta {
    
     public static void main(String[] args) {
         int dia;
         int mes;
         int año;
         boolean prueba;
         System.out.println("Escribe una fecha");
         Scanner sc= new Scanner(System.in);
         System.out.println("Escribe el dia");
         dia=sc.nextInt();
         System.out.println("Escribe el mes");
         mes=sc.nextInt();
         System.out.println("Escribe el año");
         año=sc.nextInt();
         prueba=fechacorrecta(dia,mes,año);
         
        
     }
     
     public static boolean fechacorrecta(int dia,int mes, int año){
     boolean correcto;
     
     
     if(mes>1 && mes<=12 && año>1900 && dia>1 && dia<=30){
         System.out.println("El numero es correcto");
     correcto=true;
     
     }
     
     else{
     correcto=false;
         System.out.println("El numero no es correcto");
     
     }
     return correcto;
     
     
     
     }
     
     
     
     
     
     
     }
    
    
    
    
    
    
    


