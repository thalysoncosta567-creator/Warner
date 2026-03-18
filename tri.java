/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;
import java.util.Scanner;
/**
 *
 * @author thaly
 */
public class tri {
    private float b;
    private float h;
    private Scanner s;
    private float area;

    
    public tri(){
        s = new Scanner(System.in);
        h =0;
        b=0;
       
    }
    
    public void entrada (){
        System.out.println("Digite a altura");   
        h = s.nextFloat();
            System.out.println("Digite a base");   
        b = s.nextFloat();
         
           }
    
 
    public void imprimir(){
        
      
   
        area = (b*h)/2;
      
        System.out.printf("Area : %f", area);
}
}
