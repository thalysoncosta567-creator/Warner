package ex10;

import java.util.Scanner;

public class Media {

    private float n1, n2, media;
    private Scanner s;

    public Media(){
        s = new Scanner(System.in);
        n1 = 0;
        n2 = 0;
        media = 0;
    }

    public void entrada(){
        System.out.println("Digite a primeira nota:");
        n1 = s.nextFloat();

        System.out.println("Digite a segunda nota:");
        n2 = s.nextFloat();
    }

    public void calcular(){
        media = (n1 * 2 + n2 * 3) / 5;
    }

    public void imprimir(){
        System.out.printf("Media: %.2f\n", media);

        if(media >= 5){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
