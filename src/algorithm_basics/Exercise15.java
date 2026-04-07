package algorithm_basics;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = teclado.nextInt();
        // for (Nasce; Pergunta; Subtrai)
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        teclado.close();

    }
}

/*Leia um número inteiro n e mostre os números de 1 até n em ordem decrescente.*/

/* OU
        int i = n;10
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
*/