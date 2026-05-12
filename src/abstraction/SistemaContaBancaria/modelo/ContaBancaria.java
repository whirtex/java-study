package abstraction.SistemaContaBancaria.modelo;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private float saldo;

    public ContaBancaria(String titular, String numeroConta) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular nao pode ser vazio!");
        } else {
            this.titular = titular;
        }
        if (numeroConta == null || numeroConta.isEmpty()) {
            System.out.println("Numero da conta nao pode ser vazio!");
        } else {
            this.numeroConta = numeroConta;
        }
        this.saldo = 0;
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido!");
            return;
        }
        saldo += valor;
    }

    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido!");
            return;
        }
        if (saldo < valor + 1.5f) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor + 1.5f;
    }

    public void exibirInformacoes() {
        System.out.printf("%nTitular: %s%nConta: %s%nSaldo: R$ %.2f%n",
                titular, numeroConta, saldo);
    }
}