package abstraction.SistemaGerenciamentoAlunosAcademia.modelo;

public class AlunoAcademia {
    private String nome;
    private String matricula;
    private String planoMensal;
    private int totalAulasRealizadas;
    private boolean mensalidadeAtiva;


    public AlunoAcademia(String nome, String matricula, String planoMensal, int totalAulasRealizadas, boolean mensalidadeAtiva) {
        if (nome == null || nome.isEmpty()) {
            System.out.printf("%nNome nao pode ser vazio!%n");
        } else {
            this.nome = nome;
        }
        if (matricula == null || matricula.isEmpty()) {
            System.out.printf("%nMatricula nao pode ser vazio!%n");
        } else {
            this.matricula = matricula;
        }
        if (planoMensal == null || planoMensal.isEmpty()) {
            System.out.printf("%nPlano Mensal nao pode ser vazio!%n");
        } else {
            this.planoMensal = planoMensal;
        }
        if (totalAulasRealizadas < 0) {
            System.out.printf("%nTotal de aulas realizadas nao poder ser menor que 0!%n");
        } else {
            this.totalAulasRealizadas = totalAulasRealizadas;
        }
        this.mensalidadeAtiva = mensalidadeAtiva;
    }

    public void registrarAula() {
        if (mensalidadeAtiva) {
            totalAulasRealizadas++;
        } else {
            System.out.printf("%nAcesso bloqueado por inadimplência!%n");
        }
    }

    public void renovarMensalidade() {
        if (mensalidadeAtiva) {
            System.out.printf("%nMensalidade ja esta ativa!%n");
            return;
        }
        mensalidadeAtiva = true;
        totalAulasRealizadas = 0;
    }

    public void suspenderMensalidade() {
        if (!mensalidadeAtiva) {
            System.out.printf("%nMensalidade ja esta inativa!%n");
            return;
        }
        mensalidadeAtiva = false;
    }

    @Override
    public String toString() {
        return String.format(
                "%nNome: %s%nMatricula: %s%nPlano: %s%nAulas realizadas: %d%nMensalidade ativa: %b%n",
                nome, matricula, planoMensal, totalAulasRealizadas, mensalidadeAtiva
        );
    }
}
