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
public class turron {
    
    public static void main (String[] args){
    
        System.out.println("dime un dia");
        Scanner sc= new Scanner(System.in);
        int dies=sc.nextInt();
        int trozos=ContarCalorias(dies);
        System.out.println("Comera "+trozos);
       
    
    
    }
    
    
    private static int funcioncalories(int dies){
    
    int calorias=91;
    //caso base
    
    if(dies==0){
    
    return 0;
    
    
    
    }
    
    else if(dies==1){
        
        return 4;
        
    
    
    }
    
    else if(dies%3==0){
    
    return 1+funcioncalories(dies-1);
    
    }
    
    else if(dies>1){
    
    return 4+funcioncalories(dies-1);
    
    
    }
    
    
    
    
    return -1;
    }
    private static int ContarCalorias(int dies){
    
    int calorias=91;
    //caso base
    
    if(dies==0){
    
    return 0;
    
    
    
    }
    
    else if(dies==1){
        
        return 4*calorias;
        
    
    
    }
    
    else if(dies%3==0){
    
    return (1*calorias)+funcioncalories(dies-1);
    
    }
    
    else if(dies>1){
    
    return (4*calorias)+funcioncalories(dies-1);
    
    
    }
    
    
    
    
  return -1;  
}
}

