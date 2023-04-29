import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;
        int auxiliar1 = 0, auxiliar2 = 1, fibo = 0;

        valor = scan.nextInt();

        while(valor > fibo){
            fibo = auxiliar1 + auxiliar2;
            auxiliar1 = auxiliar2;
            auxiliar2 = fibo;
        }

        if(valor == 0){
            System.out.println("O numero 0 está na sequência de Fibonacci.");
        }else if(valor == fibo){
            System.out.printf("O numero %d está na sequência de Fibonacci.", valor);
        }else{
            System.out.printf("O número %d não faz parte da sequência de Fibonacci", valor);
        }

    }
}



