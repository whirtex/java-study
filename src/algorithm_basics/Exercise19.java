package algorithm_basics;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        int contador = 0;
        int maior = 0;
        int menor = 0;

        while (numero != -1) {
            System.out.print("Digite um numero positivo (ou -1 para sair): ");
            numero = teclado.nextInt();

            if (numero != -1) {
                soma = soma + numero;
                contador++;

                if (contador == 1) {
                    maior = numero;
                    menor = numero;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;

            System.out.printf("Somatório: %d%n", soma);
            System.out.printf("Média: %.2f%n", media);
            System.out.printf("Maior número: %d%n", maior);
            System.out.printf("Menor número: %d%n", menor);

        } else {
            System.out.printf("Nenhum numero válido foi digitado.%n");
        }

        teclado.close();
    }
}

/* Leia números inteiros positivos até que o usuário digite -1. Ao final, mostre a
soma, a média aritmética, o menor e o maior número digitado.*/