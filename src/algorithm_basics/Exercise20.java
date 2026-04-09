package algorithm_basics;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0;
        int digitos = 0;
        int outros = 0;
        char ingresso = ' ';

        while (ingresso != '.') {
            System.out.print("Digite um caractere (ou . para sair): ");
            ingresso = teclado.next().charAt(0);

            ingresso = Character.toLowerCase(ingresso);

            if (ingresso != '.') {
                if (ingresso == 'a' || ingresso == 'e' || ingresso == 'i' || ingresso == 'o' || ingresso == 'u') {
                    vogais++;
                } else if (ingresso >= '0' && ingresso <= '9') {
                    digitos++;
                } else {
                    outros++;
                }
            }
        }

        System.out.printf("Quantidade de vogais: %d%n", vogais);
        System.out.printf("Quantidade de dígitos: %d%n", digitos);
        System.out.printf("Quantidade de outros caracteres: %d%n", outros);

        teclado.close();
    }
}

/*Leia caracteres até que o usuário digite um ponto (‘.’). Ao final, mostre: a
quantidade de vogais, a quantidade de dígitos e a quantidade dos demais
caracteres.*/