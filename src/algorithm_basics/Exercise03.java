package algorithm_basics;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor em segundos: ");
        int segundosTotais = teclado.nextInt();

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

        teclado.close();
    }
}

/*Leia um valor em segundos e mostre esse tempo no formato h:m:s
(horas, minutos e segundos).*/