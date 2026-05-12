package abstraction.SistemaContaBancaria.modelo;

public class ContaBancaria {
    private final String numeroConta;
    private String titular;
    private float saldo;

    public ContaBancaria(String titular, String numeroConta) {
        if (titular == null || titular.isEmpty()) {
            System.out.printf("%nTitular nao pode ser vazio!%n");
        } else {
            this.titular = titular;
        }
        if (numeroConta == null || numeroConta.isEmpty()) {
            System.out.printf("%nNumero da conta nao pode ser vazio!%n");
            this.numeroConta = "";
        } else {
            this.numeroConta = numeroConta;
        }
        this.saldo = 0;
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.printf("%nValor invalido!%n");
            return;
        }
        saldo += valor;
    }

    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.printf("%nValor invalido!%n");
            return;
        }
        if (saldo < valor + 1.5f) {
            System.out.printf("%nSaldo insuficiente!%n");
            return;
        }
        saldo -= valor + 1.5f;
    }

    @Override
    public String toString() {
        return String.format(
                "%nTitular: %s%nConta: %s%nSaldo: R$ %.2f%n",
                titular, numeroConta, saldo
        );
    }
}