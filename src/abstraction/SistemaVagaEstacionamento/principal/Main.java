package abstraction.SistemaVagaEstacionamento.principal;

import abstraction.SistemaVagaEstacionamento.modelo.Vaga;

public class Main {
    public static void main(String[] args) {
        Vaga vaga = new Vaga("A12", "CARRO", 5.00f);
        System.out.println(vaga);

        vaga.ocuparVaga("CARRO");
        System.out.println(vaga);

        vaga.ocuparVaga("MOTO");
        vaga.ocuparVaga("CARRO");

        System.out.printf("Valor a pagar: R$ %.2f%n", vaga.liberarVaga(3.5f));
        System.out.println(vaga);

        vaga.liberarVaga(1f);
    }
}