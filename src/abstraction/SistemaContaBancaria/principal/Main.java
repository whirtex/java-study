package abstraction.SistemaContaBancaria.principal;

import abstraction.SistemaContaBancaria.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Igor Costa", "67670-1");
        conta.exibirInformacoes();

        conta.depositar(500f);
        conta.exibirInformacoes();

        conta.sacar(150f);
        conta.exibirInformacoes();

        conta.sacar(1000f);
        conta.depositar(-50f);
        conta.sacar(-10f);
    }
}