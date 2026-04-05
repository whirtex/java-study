package algorithm_basics;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        double nReal = teclado.nextDouble();

        int nParteInteira = (int) nReal;

        double nParteDecimal = nReal - nParteInteira;

        if (nParteDecimal < 0.5) {
            System.out.printf("O numero arredondado é: %d%n", nParteInteira);
        } else {
            System.out.printf("O numero arredondado é: %d%n", (nParteInteira + 1));
        }

        teclado.close();

    }
}

/*Leia um número real x e mostre-o arredondado. Se a parte decimal for menor
que 0.5, arredonde para baixo; se for maior ou igual a 0.5, arredonde para cima.*/