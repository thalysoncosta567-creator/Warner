package ex6;
import java.util.Scanner;
/**
/**
 *
 * @author thaly
 */
public class impar {
    private int[] num;
    private int soma;
    private Scanner s;
   

    
    public impar(){
        s = new Scanner(System.in);
        soma=0;
        num =new int[10];
       
    }
    
    public void entrada (){
for( int i = 0; i <10; i ++){
    System.out.println("digite um numero");
    num[i] = s.nextInt();
}
    }
public void somai (){
for( int i = 0; i <10; i ++){
    if(num[i] % 2 != 0){
        soma += num[i];
    }
} 
}
 
   public void imprimir(){
       System.out.printf("a soma dos impares %d", soma);
   }

}
