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
public class aranyes {
     public static void main (String[] args){
     
     Scanner sc= new Scanner(System.in);
         System.out.println("Cuantas aranyes tienes");
         int aranyes=sc.nextInt();
         int potes= contarPotes(aranyes);
         System.out.println(potes);
         potes = contarPotesMutants(aranyes);
         System.out.println(potes);
         
     
     
     
     }
     
     private static int contarPotes(int aranyes){
     
     if(aranyes==0){
     
     
     return 0;
     }
     if (aranyes==1){
     return 8;
     
     
     }
     else if (aranyes>1){
     
     return 8+contarPotes(aranyes-1);
             
     
     
     }
     return -1;
     
     }
     
     private static int contarPotesMutants(int aranyes){
     
     if(aranyes==0){//caso base
     
     
     return 0;
     
     }
     else if(aranyes%2!=0){
     
     return 8+contarPotesMutants(aranyes-1);
     
     }
     else if(aranyes%2==0){
     
     return 6+contarPotes(aranyes-1);
             
     
     }
     
     
     
     return -1;
     }
     
     
}
