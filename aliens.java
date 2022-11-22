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
public class aliens {
    
 public static void main (String[] args){
 int virus;
 Scanner sc= new Scanner(System.in);
 virus=sc.nextInt();
 
 int viruz=funcionvirus(virus);
     System.out.println(viruz);
 
 }
 private static int funcionvirus(int dia){
     
if(dia==1){
return 1;

}

else if(dia>1){

return 3*funcionvirus(dia-1);

}

return -1;
}

 
 }   


    
    
    
    
    
    
    
    
    
    

