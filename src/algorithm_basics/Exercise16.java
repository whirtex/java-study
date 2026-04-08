package algorithm_basics;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = teclado.nextInt();

        if (n < 0) {
            for (int i = n; i <= 0; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        }

        teclado.close();
    }
}

/* Leia um número inteiro n e mostre os números de 0 até n, caso n seja positivo. Se
n for negativo, mostre de n até 0*/