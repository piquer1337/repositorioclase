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
public class NewClass {
    
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int num1=sc.nextInt();
    num1=numeroreves(num1);
    
    
    
    
    }
    
    
    
    private static int numeroreves(int num1){
    
    //caso base
    
    if(num1<10){
    
        System.out.println(num1);
    }
    else {
        System.out.print(num1%10);
        numeroreves(num1/10);
    
    }
    
    return -1;
    }
    
    
    }
    

