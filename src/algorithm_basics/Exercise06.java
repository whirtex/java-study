package algorithm_basics;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota AP1: ");
        double ap1 = teclado.nextDouble();

        System.out.print("Nota AP2: ");
        double ap2 = teclado.nextDouble();

        System.out.print("Nota AC: ");
        double ac = teclado.nextDouble();

        double mediaFinal = (0.4 * ap1) + (0.4 * ap2) + (0.2 * ac);

        System.out.printf("Sua média final é: %.1f%n", mediaFinal);

        if (mediaFinal >= 7) {
            System.out.print("Voce foi aprovado! :)");
        } else {
            System.out.print("Voce foi reprovado! :( ");
        }

        teclado.close();

    }
}

/*Leia as notas de ap1, ap2 e ac, calcule a média do aluno e mostre
“Aprovado” se média for ≥ 7, senão mostre “Reprovado”
Média do aluno = 40% da ap1 + 40% da ap2 + 20% da ac */