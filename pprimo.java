package ex11;

import java.util.Scanner;

public class Pprimo {

    private int num;
    private Scanner s;

    public Pprimo(){
        s = new Scanner(System.in);
        num = 0;
    }

    public void entrada(){
        System.out.println("Digite um numero:");
        num = s.nextInt();
    }

    public void calcular(){
        // não precisa fazer nada aqui nesse caso
    }

    public void imprimir(){
        System.out.println("Numeros primos entre 1 e " + num + ":");

        for(int i = 2; i <= num; i++){ // começa do 2
            int contador = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    contador++;
                }
            }

            if(contador == 2){
                System.out.print(i + " ");
            }
        }
    }
}
