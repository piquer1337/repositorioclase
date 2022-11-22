/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2.recursivas;

/**
 *
 * @author semo3415
 */
public class recursivos {
    public static void main(String[] args) {
        
        int valor=5;
        System.out.println(valor+"! = "+factorial(valor));
        
        
        
        
        
        
        
        
        
    }
    
    public static int factorial(int n){
    //1 o mas casos base(que no se llama a esa misma y que se da un resultado)
    //tiene que tener 1 o mas llamadas recursivas, es llamarse a ella misma pero variando e
    //el valor de los parametros de la llamada y puede que alguna operación
    if(n==1){
    
    return 1;
    }
    else if(n==0){
    
    return 1;
    }
    else//if n>1
    {
        System.out.println("crido a " +n+" * factorial("+(n-1)+")");
        
    return n*factorial(n-1);
    
    
    
    }
    
   // return 0;
    //if(n<=1)
    
    
    
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

