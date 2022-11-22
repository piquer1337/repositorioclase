/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import PackageMath.Utilitats;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int millas;
        double km;
        System.out.println("Escribe las millas");
        millas=Utilitats.pedirValorPositivo();
        
        km =millas_a_kilometros(millas);
        System.out.println("Los kilometros son"+km);
    }
    
    
    
    public static double millas_a_kilometros(int millas){
    double kil=0;
    kil = millas * 1.60934;
    return kil;
    
    
    }
    
}
    
    
    
    
    
    
    
    

