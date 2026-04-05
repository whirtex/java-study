package algorithm_basics;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma operação aritimetica: ");
        char op = teclado.next().charAt(0);

        System.out.print("Digite um numero real: ");
        double n1 = teclado.nextDouble();

        System.out.print("Digite outro numero real: ");
        double n2 = teclado.nextDouble();

        switch (op) {
            case '+':
                System.out.printf("%.1f + %.1f = %.1f%n", n1, n2, (n1 + n2));
                break;
            case '-':
                System.out.printf("%.1f - %.1f = %.1f%n", n1, n2, (n1 - n2));
                break;
            case '*':
                System.out.printf("%.1f * %.1f = %.1f%n", n1, n2, (n1 * n2));
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero!");
                } else {
                    System.out.printf("%.1f / %.1f = %.1f%n", n1, n2, (n1 / n2));
                }
                break;
            default:
                System.out.println("Simbolo não reconhecido");
                break;
        }

        teclado.close();

    }
}

/*Leia um caractere op representando uma operação aritmética (+, -, *, /) e dois
números reais a e b. Mostre a expressão no formato a op b = resultado. Utilize a
estrutura switch-case para resolver.*/