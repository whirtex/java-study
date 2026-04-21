package abstraction.SistemaReservaPassagensAereas.principal;

import abstraction.SistemaReservaPassagensAereas.modelo.Passagem;

public class Main {
    public static void main(String[] args) {
        Passagem passagem = new Passagem("RES067", "Igor Costa", "GIG", "GRU", 850.00f, 0, "AGUARDANDO");
        passagem.exibirInformacoes();

        passagem.confirmarReserva();
        passagem.exibirInformacoes();

        passagem.aplicarUpgrade(200.00f);
        passagem.exibirInformacoes();

        passagem.cancelarReserva();
        passagem.exibirInformacoes();

        passagem.confirmarReserva();
        passagem.cancelarReserva();
        passagem.aplicarUpgrade(100.00f);
        passagem.aplicarUpgrade(-50.00f);
    }
}