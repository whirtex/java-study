package abstraction.SistemaVagaEstacionamento.modelo;

public class Vaga {
    private final String idVaga;
    private String tipoVaga;
    private float valorHora;
    private boolean statusVaga;

    public Vaga(String idVaga, String tipoVaga, float valorHora) {
        if (idVaga == null || idVaga.isEmpty()) {
            System.out.printf("%nId da vaga nao pode ser vazio!%n");
            this.idVaga = "";
        } else {
            this.idVaga = idVaga;
        }
        if (tipoVaga == null || tipoVaga.isEmpty()) {
            System.out.printf("%nTipo de vaga nao pode ser vazio!%n");
        } else if (!tipoVaga.equalsIgnoreCase("MOTO") && !tipoVaga.equalsIgnoreCase("CARRO") && !tipoVaga.equalsIgnoreCase("CAMINHAO")) {
            System.out.printf("%nTipo invalido! Use MOTO, CARRO ou CAMINHAO%n");
        } else {
            this.tipoVaga = tipoVaga.toUpperCase();
        }
        if (valorHora <= 0) {
            System.out.printf("%nValor invalido!%n");
        } else {
            this.valorHora = valorHora;
        }
        this.statusVaga = true;
    }

    public void ocuparVaga(String tipoVeiculo) {
        if (!statusVaga) {
            System.out.printf("%nVaga ja esta ocupada!%n");
            return;
        }
        if (!tipoVeiculo.equalsIgnoreCase(tipoVaga)) {
            System.out.printf("%nTipo de veiculo incompativel com a vaga!%n");
            return;
        }
        statusVaga = false;
    }

    public float liberarVaga(float tempoHoras) {
        if (statusVaga) {
            System.out.printf("%nVaga ja esta livre!%n");
            return 0;
        }
        if (tempoHoras <= 0) {
            System.out.printf("%nTempo invalido!%n");
            return 0;
        }
        statusVaga = true;
        return tempoHoras * valorHora;
    }

    @Override
    public String toString() {
        return String.format(
                "%nId: %s%nTipo: %s%nStatus: %s%nValor por hora: R$ %.2f%n",
                idVaga, tipoVaga, statusVaga ? "Livre" : "Ocupada", valorHora
        );
    }
}