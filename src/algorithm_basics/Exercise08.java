package algorithm_basics;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n1 = teclado.nextInt();


        if (n1 % 2 == 0) {
            System.out.printf("%d é par!%n", n1);
        } else {
            System.out.printf("%d é impar!%n", n1);
        }

        teclado.close();

    }
}

/*Leia um número inteiro n e mostre se ele é par ou ímpar.*/