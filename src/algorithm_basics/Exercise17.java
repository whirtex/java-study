package algorithm_basics;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}

/*Leia um número inteiro n e mostre todos os divisores de n.*/

/* OU
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
 */