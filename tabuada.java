package ex7;
import java.util.Scanner;
/**
/**
 *
 * @author thaly
 */
public class tabuada {
    private int num;
    private int soma;
    private Scanner s;
   

    
    public tabuada(){
        s = new Scanner(System.in);
   
        num = 0;
       
    }
    
    public void entrada (){
        
        System.out.println("Digite ate que numero vc quer a tabuada");
        num = s.nextInt();
for( int i = 1; i <= num ; i ++){
   
    for( int j = 0; j <= 10 ; j ++){
    System.out.printf("%d x %d = %d \n", i, j, (i*j));
}
    
}
    }

 
   public void imprimir(){
       System.out.printf("tabuada do 1 ate %d \n", num); 
   }

}
