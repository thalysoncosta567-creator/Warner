/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_3w;
import java.util.Scanner;
/**
 *
 * @author aluno9
 */
public class turma {
    private int idade;
    private Scanner s;
    private String nome;
    
    public turma(){
        s = new Scanner(System.in);
        idade =0;
        nome = "";
    }
    
    public void entrada (){
        System.out.println("Digite sua idade");   
        idade = s.nextInt();
         
         s.nextLine();
            System.out.println("Digite seu nome"); 
            
          nome = s.nextLine();
    }
    
 
    public void imprimir(){
        
        if(idade >= 5 && idade < 8){
            System.out.printf("Sua turma e infantil A");
        } else if(idade >= 8 || idade < 11){
             System.out.printf("Sua turma e infantil B");
        }
          else if(idade >= 11 && idade < 14){
             System.out.printf("Sua turma e juvenil A");
        }  else if(idade >= 14 &&15 idade < 18){
             System.out.printf("Sua turma e juvenil B");
        }
          else if(idade >= 18){
             System.out.printf("Sua turma e adulto");
        }
        
      
        System.out.printf("\nNome : %s", nome);
    }
}
