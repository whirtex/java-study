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

        double resultado1 = somar(numero1, numero2);
        double resultado2 = subtrair(numero1, numero2);
        double resultado3 = multiplicar(numero1, numero2);
        double resultado4 = dividir(numero1, numero2);

        System.out.println("A soma dá: " + resultado1);
        System.out.println("A subtracao dá: " + resultado2);
        System.out.println("A multiplicação dá: " + resultado3);
        System.out.println("A divisão dá: " + resultado4);

        teclado.close();

    }
}




