package abstraction.SistemaReservaPassagensAereas.principal;

import abstraction.SistemaReservaPassagensAereas.modelo.Passagem;

public class Main {
    public static void main(String[] args) {
        Passagem passagem = new Passagem("RES067", "Igor Costa", "GIG", "GRU", 850.00f, 0, "AGUARDANDO");
        System.out.println(passagem);

        passagem.confirmarReserva();
        System.out.println(passagem);

        passagem.aplicarUpgrade(200.00f);
        System.out.println(passagem);

        passagem.cancelarReserva();
        System.out.println(passagem);

        passagem.confirmarReserva();
        passagem.cancelarReserva();
        passagem.aplicarUpgrade(100.00f);
        passagem.aplicarUpgrade(-50.00f);
    }
}