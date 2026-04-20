package abstraction.SistemaControleMedicamentos.modelo;

public class Medicamento {
    private String nome;
    private String principioAtivo;
    private int qtdEstoque;
    private float precoUnitario;
    private boolean necessitaReceita;

    public Medicamento(String nome, String principioAtivo, int qtdEstoque, float precoUnitario, boolean necessitaReceita) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome nao pode ser vazio!");
        } else {
            this.nome = nome;
        }
        if (principioAtivo == null || principioAtivo.isEmpty()) {
            System.out.println("Principio ativo do medicamento nao pode ser vazio!");
        } else {
            this.principioAtivo = principioAtivo;
        }
        if (qtdEstoque <= 0) {
            System.out.println("Quantidade em estoque nao pode ser negativa ou zero!");
        } else {
            this.qtdEstoque = qtdEstoque;
        }
        if (precoUnitario <= 0) {
            System.out.println("Preco unitario nao pode ser negativo ou zero!");
        } else {
            this.precoUnitario = precoUnitario;
        }
        this.necessitaReceita = necessitaReceita;
    }

    public void entradaEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
            return;
        }

        qtdEstoque += quantidade;
    }

    public void venderUnidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
            return;
        }

        if (quantidade > qtdEstoque) {
            System.out.printf("%nEstoque insuficiente!%n");
        } else {
            qtdEstoque -= quantidade;
        }
    }

    public void aplicarReajuste(float percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual invalido!");
            return;
        }

        precoUnitario *= 1+ percentual/100;
        }

    public void exibirInformacoes() {
        System.out.printf("%nNome: %s%nPreco: %.2f%nEstoque: %d%nPrincipio Ativo: %s%nNecessita receita: %s%n", nome, precoUnitario, qtdEstoque, principioAtivo, necessitaReceita);
    }
}
