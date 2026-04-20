package abstraction.SistemaControleMedicamentos.principal;

import abstraction.SistemaControleMedicamentos.modelo.Medicamento;

public class Main {
    public static void main(String[] args) {
        Medicamento histadinD = new Medicamento("HistadinD", "Loratadina + Sulfato de Pseudoefedrina", 3, 41.69f, false);
        histadinD.exibirInformacoes();

        histadinD.entradaEstoque(165);
        histadinD.exibirInformacoes();

        histadinD.venderUnidade(101);
        histadinD.exibirInformacoes();

        histadinD.aplicarReajuste(15);
        histadinD.exibirInformacoes();

        histadinD.venderUnidade(68);
        histadinD.entradaEstoque(-2);
        histadinD.venderUnidade(-3);
        histadinD.aplicarReajuste(102);

        histadinD.exibirInformacoes();

    }
}
