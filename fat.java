package ex8;
import java.util.Scanner;
/**
/**
 *
 * @author thaly
 */
public class fat {
    private int num;
    private int fat;
    private Scanner s;
 
public  fat(){
    s = new Scanner(System.in);
   fat = 1;
        num = 0;
       

    }
  public void entrada (){
        
        System.out.println("Digite um numero");
        num = s.nextInt();
  }
  public void calcular (){
      for(int i =1; i <= num; i ++){
          fat *= i;
      }
  }

 
   public void imprimir(){
       System.out.printf("fatorial %d", fat); 
   }

}
