package algorithm_basics;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua massa(kg): ");
        double massa = teclado.nextDouble();

        System.out.print("Digite sua altura(m): ");
        double altura = teclado.nextDouble();

        double imc = massa / (altura*altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Diagnóstico: Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Diagnóstico: Peso normal");
        } else if (imc <= 30.0) {
            System.out.println("Diagnóstico: Sobrepeso");
        } else {
            System.out.println("Diagnóstico: Obesidade");
        }

        teclado.close();
    }
}



/*Leia a massa e a altura de uma pessoa. Calcule e mostre o Índice de
Massa Corporal (IMC), usando a fórmula: IMC = massa ÷ (altura²).*/