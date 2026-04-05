package algorithm_basics;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro entre 1 e 7: ");
        int n = teclado.nextInt();

        switch (n) {
            case 1:
                System.out.println("1 -> Domingo");
                break;
            case 2:
                System.out.println("2 -> Segunda");
                break;
            case 3:
                System.out.println("3 -> Terça");
                break;
            case 4:
                System.out.println("4 -> Quarta");
                break;
            case 5:
                System.out.println("5 -> Quinta");
                break;
            case 6:
                System.out.println("6 -> Sexta");
                break;
            case 7:
                System.out.println("7 -> Sabado");
                break;
            default:
                System.out.println("Insira um numero entre 7 e 1");
        }

        teclado.close();

    }
}

/*Leia um número inteiro de 1 a 7 e mostre o dia da semana correspondente (1 =
Domingo, 2 = Segunda, ..., 7 = Sábado). Utilize a estrutura switch-case para
resolver.*/