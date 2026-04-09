package algorithm_basics;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0;
        int digitos = 0;
        int outros = 0;
        // char para nao dar erro na primeira volta
        char ingresso = ' ';

        while (ingresso != '.') {
            System.out.print("Digite um caractere (ou . para sair): ");
            ingresso = teclado.next().charAt(0);

            // converte pra minuscula para facilitar a conta
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

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);

        teclado.close();

    }
}

/*Leia caracteres até que o usuário digite um ponto (‘.’). Ao final, mostre: a
quantidade de vogais, a quantidade de dígitos e a quantidade dos demais
caracteres.*/