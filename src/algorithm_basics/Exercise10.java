package algorithm_basics;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n = teclado.nextDouble();

        if (n >= 100 && n <= 999) {
            System.out.printf("O numero %.1f esta dentro do intervalo!%n", n);
        } else {
            System.out.printf("O numero %.1f nao esta dentro do intervalo!%n", n);
        }

        teclado.close();

    }
}

/*Leia um número n, verifique e mostre se ele está dentro do intervalo entre 100 e
999.*/