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
public class EncontrarMaximoFuncion {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        double valor1;
        double valor2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el valor 1");
        valor1=sc.nextDouble();
        System.out.println("Ingresa el valor 2");
        valor2=sc.nextDouble();
        double max = maximo(valor1,valor2);
        System.out.println("Maximo"+max);
        double min =minimo(valor1,valor2);
        System.out.println("Minimo"+min);
       
       
    }
    
    public static double maximo(double valor1, double valor2) {
    double max;
        if (valor1 > valor2)
        max = valor1;
        else
        max = valor2;
        return max;
    
}
    public static double minimo(double valor1, double valor2) {
    double min;
        if (valor1 > valor2)
        min = valor2;
        else
        min = valor1;
        return min;
    
}
    
    
    
    
    
    
    
    
}

