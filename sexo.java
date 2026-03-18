/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author aluno9
 */
public class sexo {
    private float h;
    private Scanner s;
    private String nome;
    private float fem;
    private float m;
    
    public sexo(){
        s = new Scanner(System.in);
        h =0;
        fem = (62.1f* h)-44.7f;
        m = (72.7f* h)-44.7f;
        nome = "";
    }
    
    public void entrada (){
        System.out.println("Digite sua altura");   
        h = s.nextFloat();
         
         s.nextLine();
            System.out.println("Digite seu sexo"); 
            
             fem = (62.1f* h)-44.7f;
        m = (72.7f* h)-44.7f;
        
          nome = s.nextLine();
    }
    
 
    public void imprimir(){
        
        if(nome.equals("Feminino")){
            System.out.printf("Seu peso ideal eh %f" , fem);
            
        }        else if(nome.equals("feminino")){
            System.out.printf("Seu peso ideal eh %f"  , fem);
            
        }  if(nome.equals("Masculino")){
            System.out.printf("Seu peso ideal eh %f" , m);
            
        }        else if(nome.equals("masculino")){
            System.out.printf("Seu peso ideal eh %f"  , m);
            
        }
   
        
      
        System.out.printf("\nNome : %s", nome);
    }
}
