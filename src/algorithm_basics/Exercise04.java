package algorithm_basics;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu salario: ");
        double salario = teclado.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double aumentoPercentual = teclado.nextDouble();

        double valorAumento = salario * (aumentoPercentual / 100);
        double novoSalario = salario + valorAumento;

        System.out.printf("Seu novo salario é R$ %.2f%n", novoSalario);

        teclado.close();

    }
}

/*Leia o valor do salário de uma pessoa e um percentual de aumento.
        Depois, mostre o novo salário com o aumento aplicado.*/