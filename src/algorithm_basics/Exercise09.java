package algorithm_basics;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double quantidadekWh = teclado.nextDouble();

        System.out.print("Digite o valor do kWh: ");
        double valorkWh = teclado.nextDouble();

        double valorConta = quantidadekWh * valorkWh;

        double valorContaDesconto = valorConta * 0.9;

        if (quantidadekWh < 150) {
            System.out.printf("Sua conta deu menos que 150 kWh, voce conseguiu um desconto de 10%%. O valor final ficou: R$ %.2f%n", valorContaDesconto);
        } else {
            System.out.printf("O valor da sua conta ficou: R$ %.2f%n", valorConta);
        }

        teclado.close();

    }
}

/*Leia a quantidade de kWh consumidos e o valor de cada kWh.
Calcule o valor da conta. Se o consumo for menor que 150 kWh,
aplique 10% de desconto. Mostre o valor da conta final.*/