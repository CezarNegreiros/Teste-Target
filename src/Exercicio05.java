import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavra = leitor.nextLine();
        String reverso = "";
        char ch;

        for (int i=0; i<palavra.length(); i++) {
            ch = palavra.charAt(i);
            reverso = ch + reverso;
        }

        System.out.println(reverso);
    }
}
