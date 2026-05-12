package abstraction.SistemaVagaEstacionamento.modelo;

public class Vaga {
    private final String idVaga;
    private String tipoVaga;
    private float valorHora;
    private boolean statusVaga;

    public Vaga(String idVaga, String tipoVaga, float valorHora, boolean statusVaga) {
        this.idVaga = idVaga;
        this.tipoVaga = tipoVaga;
        this.valorHora = valorHora;
        this.statusVaga = statusVaga;
    }
}