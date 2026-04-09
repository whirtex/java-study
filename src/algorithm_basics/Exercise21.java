package algorithm_basics;

import java.util.Scanner;

public class Exercise21 {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Não existe divisão por zero!");
            return 0;
        }
        return a / b;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = teclado.nextDouble();

        System.out.printf("A soma dá: %.1f%n", somar(numero1, numero2));
        System.out.printf("A subtracao dá: %.1f%n", subtrair(numero1, numero2));
        System.out.printf("A multiplicacao dá: %.1f%n", multiplicar(numero1, numero2));
        System.out.printf("A divisao dá: %.1f%n", dividir(numero1, numero2));

        teclado.close();

    }
}

/*Complemente a classe Matematica com métodos para subtrair,
multiplicar e dividir dois números inteiros. Teste os métodos criados.*/




