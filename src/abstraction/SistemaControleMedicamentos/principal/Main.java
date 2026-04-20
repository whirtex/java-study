package abstraction.SistemaControleMedicamentos.principal;

import abstraction.SistemaControleMedicamentos.modelo.Medicamento;

public class Main {
    public static void main(String[] args) {
        Medicamento histadinD = new Medicamento("HistadinD", "Loratadina + Sulfato de Pseudoefedrina", 3, 41.69f, false);
        System.out.println(histadinD);

        histadinD.entradaEstoque(165);
        System.out.println(histadinD);

        histadinD.venderUnidade(101);
        System.out.println(histadinD);

        histadinD.aplicarReajuste(15);
        System.out.println(histadinD);

        histadinD.venderUnidade(68);
        histadinD.entradaEstoque(-2);
        histadinD.venderUnidade(-3);
        histadinD.aplicarReajuste(102);

        System.out.println(histadinD);

    }
}
