package algorithm_basics;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = teclado.nextInt();

        int soma = 0;
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;

            System.out.printf("Somatório dos ímpares: %d%n", soma);
            System.out.printf("Média dos ímpares: %.2f%n", media);

        } else {
            System.out.printf("Digite um numero maior que zero.%n");
        }

        teclado.close();
    }
}

/*Leia um número inteiro n e calcule o somatório e a média dos números ímpares
de 1 até n.*/

/* OU
        int soma = 0;
        int contador = 0;
        int i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                soma = soma + i;
                contador++;
            }
            i++;
        }
*/