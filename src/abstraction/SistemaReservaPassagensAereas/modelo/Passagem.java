package abstraction.SistemaReservaPassagensAereas.modelo;

public class Passagem {
    private String codigoReserva;
    private String nomePassageiro;
    private String origem;
    private String destino;
    private float valorTarifa;
    private float dividaExistente;
    private String statusReserva;

    public Passagem(String codigoReserva, String nomePassageiro, String origem, String destino, float valorTarifa, float dividaExistente, String statusReserva) {
        if (codigoReserva == null || codigoReserva.isEmpty()) {
            System.out.printf("%nCodigo da reserva nao pode ser vazio!%n");
        } else {
            this.codigoReserva = codigoReserva;
        }
        if (nomePassageiro == null || nomePassageiro.isEmpty()) {
            System.out.printf("%nNome nao pode ser vazio!%n");
        } else {
            this.nomePassageiro = nomePassageiro;
        }
        if (origem == null || origem.isEmpty()) {
            System.out.printf("%nSigla de origem invalida!%n");
        } else {
            this.origem = origem;
        }
        if (destino == null || destino.isEmpty()) {
            System.out.printf("%nSigla de destino invalida!%n");
        } else {
            this.destino = destino;
        }
        if (valorTarifa <= 0) {
            System.out.printf("%nValor da tarifa nao pode ser menor ou igual a 0!%n");
        } else {
            this.valorTarifa = valorTarifa;
        }
        if (dividaExistente < 0) {
            System.out.printf("%nDivida nao pode ser negativa!%n");
        } else {
            this.dividaExistente = dividaExistente;
        }
        if (statusReserva == null || statusReserva.isEmpty()) {
            System.out.println("Status nao pode ser vazio!");
        } else {
            switch (statusReserva) {
                case "CONFIRMADA":
                case "CANCELADA":
                case "AGUARDANDO":
                    this.statusReserva = statusReserva;
                    break;
                default:
                    System.out.println("Status invalido! Use CONFIRMADA, CANCELADA ou AGUARDANDO");
                    break;
            }
        }
    }
    public void confirmarReserva() {
        if (statusReserva.equals("CANCELADA")) {
            System.out.printf("%nNao e possivel confirmar uma reserva cancelada!%n");
            return;
        }
        statusReserva = "CONFIRMADA";
    }

    public void cancelarReserva() {
        if (statusReserva.equals("CANCELADA")) {
            System.out.printf("%nReserva ja esta cancelada!%n");
            return;
        }
        if (statusReserva.equals("CONFIRMADA")) {
            dividaExistente += valorTarifa * 0.15f;
        }
        statusReserva = "CANCELADA";
    }
    public void aplicarUpgrade(float valorAdicional) {
        if (statusReserva.equals("CANCELADA")) {
            System.out.printf("%nNao e possivel aplicar upgrade em reserva cancelada!%n");
            return;
        }
        if (valorAdicional <= 0) {
            System.out.printf("%nValor adicional invalido!%n");
            return;
        }
        valorTarifa += valorAdicional;
        dividaExistente += valorAdicional;
    }
    public void exibirInformacoes() {
        System.out.printf(
                "%nCodigo da Reserva: %s%nPassageiro: %s%nOrigem: %s%nDestino: %s%nTarifa: %.2f%nDivida: %.2f%nStatus: %s%n",
                codigoReserva, nomePassageiro, origem, destino, valorTarifa, dividaExistente, statusReserva
        );
    }

}
