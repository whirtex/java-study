package algorithm_basics;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = teclado.nextDouble();

        double soma = numero1 + numero2;
        double sub = numero1 - numero2;
        double mult = numero1 * numero2;
        double div = numero1 / numero2;

        System.out.printf("A soma é %.2f, a subtração é %.2f, a multiplicação é %.2f e a divisão é %.2f", soma, sub, mult, div );

        teclado.close();
    }
}

/*Leia dois números inteiros e mostre na tela a soma, a subtração, a
multiplicação e a divisão entre eles.*/