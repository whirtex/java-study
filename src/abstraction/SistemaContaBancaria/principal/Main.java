package abstraction.SistemaContaBancaria.principal;

import abstraction.SistemaContaBancaria.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Igor Costa", "67670-1");
        System.out.println(conta);

        conta.depositar(500f);
        System.out.println(conta);

        conta.sacar(150f);
        System.out.println(conta);

        conta.sacar(1000f);
        conta.depositar(-50f);
        conta.sacar(-10f);
    }
}