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
public class bitlles {
    public static void main (String[] args){
     
     Scanner sc= new Scanner(System.in);
         System.out.println("Cuantas files tens");
         int files=sc.nextInt();
         int bitlles= contarBitlles(files);
         System.out.println(bitlles);
         
         
     
     
     
     }
    
    
    private static int contarBitlles(int files){
    int bitlles;
    if(files==1){
    
        bitlles=1;
        return 1;
    
    
    }
    else if(files>1){
    return files+contarBitlles(files-1);
    
    }
        
    return -1;
    
    
    
    
    }    
}
