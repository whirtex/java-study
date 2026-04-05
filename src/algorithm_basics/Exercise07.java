package algorithm_basics;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = teclado.nextDouble();

        System.out.print("Digite outro numero: ");
        double n2 = teclado.nextDouble();

        if (n1 > n2) {
            System.out.printf("%.2f (n1) é maior que %.2f (n2)%n", n1, n2);
        } else if (n1 < n2) {
            System.out.printf("%.2f (n2) é maior que %.2f (n1)%n", n2, n1);
        } else {
            System.out.print("Os números sao iguais!");
        }

        teclado.close();

    }
}

/*Leia dois números reais e mostre qual é o maior e qual é o menor.*/