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
public class sumaN {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Pon un numero");
        int numer=sc.nextInt();
        int suma=suma1aN(numer);
        int producto;
        double mitad;
        System.out.println("La suma de 1 a "+numer+"es " +suma);
        
        producto=producto1aN(numer);
        System.out.println("El producto de 1 a "+producto+"es"+numer);
        
        mitad=intermedio1aN(numer);
        
        
    }
    
    
    
    
    public static int suma1aN(int n){
        int suma=0;
        for (int i = 1; i <=n; i++) {
            suma=suma+i;
        }
        return suma;
    }// Devuelve la suma de enteros de 1 a n
    public static int producto1aN(int n){
    
    int producto=1;
        for (int i = 1; i <n; i++) {
            producto=producto*i;
        }
        return producto;
    
    
    
    }
    
    public static double intermedio1aN(int n){
    
    double mitad=(double)(1+n)/2;
    return mitad;
    
    
    
    }
    
    
    
    
    
}
