package ex9;

import java.util.Scanner;

public class Primo {

    private int num;
    private int contador;
    private Scanner s;

    public Primo(){
        s = new Scanner(System.in);
        contador = 0;
        num = 0;
    }

    public void entrada(){
        System.out.println("Digite um numero");
        num = s.nextInt();
    }

    public void calcular(){
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                contador++;
            }
        }
    }

    public void imprimir(){
        if(contador == 2){
            System.out.printf("%d eh numero primo\n", num);
        } else {
            System.out.printf("%d nao eh numero primo\n", num);
        }
    }
}
