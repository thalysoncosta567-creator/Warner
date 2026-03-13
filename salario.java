/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2_warner;
import java.util.Scanner;
/**
 *
 * @author aluno9
 */
public class salario {
    private double bsalario;
    private double nsalario;
    private Scanner s;
    private int perc;
    private String nome;
    
    public salario(){
        s = new Scanner(System.in);
        bsalario=0;
        nsalario = 0;
        perc =0; 
        nome = "";
    }
    
    public void entrada (){
        System.out.println("Digite seu salario");   
        bsalario = s.nextDouble();
         System.out.println("Digite o aumento");
         this.perc = s.nextInt();  
         s.nextLine();
            System.out.println("Digite seu nome"); 
            
          nome = s.nextLine();
    }
    
    public void atualiza(){
        nsalario = ((bsalario * perc )/100) +bsalario;
    }
    public void imprimir(){
        
        System.out.printf("Novo Salario: %.2f", nsalario);
      
        System.out.printf("\nNome : %s", nome);
    }
}
