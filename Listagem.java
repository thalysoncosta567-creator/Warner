import java.util.Scanner;

public class ListaNumeros {

    private int limite;
    private Scanner leitor;

    public ListaNumeros(){
        limite = 0;
    }

    public void lerDados(){
        leitor = new Scanner(System.in);

        System.out.println("\nDigite um numero: ");
        limite = leitor.nextInt();
    }

    public void mostrarPares(){
        System.out.println("\nNumeros pares:\n");

        for(int i = 1; i <= limite; i++){
            if(i % 2 == 0){
                System.out.printf("%d  ", i);
            }
        }
    }

    public void mostrarImpares(){
        System.out.println("\nNumeros impares:\n");

        for(int i = 1; i <= limite; i++){
            if(i % 2 != 0){
                System.out.printf("%d  ", i);
            }
        }
    }
}
