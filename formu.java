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
public class formu {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon un valor y te diré el signo");
        int numero=sc.nextInt();
        int signo=dimeSigno(numero);
        
        if(signo==1){
            System.out.println("Es positivo");
        
        }
        else if (signo==-1){
            System.out.println("Es negativo");
        
        }
        
        else{
            System.out.println("Es cero");
        
        }
        
        
        
    }
    
    
    
    
    public static int dimeSigno(int num){
    int signo;
    if(num==0)
        {
        signo=0;
        
        }
    else if(num>0){
    
    signo=1;
    
    }
    else{
    signo= -1;
    }
    
    return signo;
    
    
    
    }
}
