package algorithm_basics;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro lado do triangulo: ");
        double ladoA = teclado.nextDouble();

        System.out.print("Digite o tamanho do segundo lado do triangulo: ");
        double ladoB = teclado.nextDouble();

        System.out.print("Digite o tamanho do terceiro lado do triangulo: ");
        double ladoC = teclado.nextDouble();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triangulo é equilatero! ");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("O triangulo é isosceles! ");
        } else {
            System.out.println("O triangulo é escaleno! ");
        }

        teclado.close();

    }
}

/*Leia os três lados de um triângulo e mostre se ele é equilátero, isósceles ou
escaleno.*/

/* OU
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triangulo é equilatero! ");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("O triangulo é escaleno! ");
        } else {
            System.out.println("O triangulo é isosceles! ");

        }
*/