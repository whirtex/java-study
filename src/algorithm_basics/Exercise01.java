package algorithm_basics;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.printf("%s tem %d anos%n", nome, idade);
        
        teclado.close();
    }
}