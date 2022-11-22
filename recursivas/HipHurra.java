/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2.recursivas;

/**
 *
 * @author semo3415
 */
public class HipHurra {
    public static void main(String[] args) {
        int num=5;
        salut(num);
        
        
    }
    
    public static void salut(int n)
    {
    //caso base
        if(n==0){
        
            System.out.println("Hurra!!!");
        
        }
        else
        {
        
        
            System.out.println(n+"Hip Hip");
            salut(n-1);
        }
    
    
    
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

