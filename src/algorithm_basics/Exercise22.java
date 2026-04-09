package algorithm_basics;

import java.util.Scanner;

public class Exercise22 {

    // Verifica se o número é positivo
    public static boolean ePositivo(int numero) {
        return numero > 0;
    }

    // Verifica se o número é par
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    // Verifica se o número é primo
    public static boolean ePrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("É positivo? " + ePositivo(numero));
        System.out.println("É par? " + ePar(numero));
        System.out.println("É primo? " + ePrimo(numero));

        scanner.close();
    }
}

/*Crie a classe Inteiro com os seguintes métodos:
    • Que recebe um número inteiro e retorna true se ele for positivo e
    false, caso contrário.
    • Que recebe um número inteiro e retorna true se ele for par e false,
    caso contrário.
    • Que recebe um número inteiro e retorna true se ele for primo e false,
    caso contrário.
    • Teste os métodos criados com números inteiros lidos do teclado*/