package abstraction.SistemaGerenciamentoAlunosAcademia.principal;

import abstraction.SistemaGerenciamentoAlunosAcademia.modelo.AlunoAcademia;

public class Main {
    public static void main(String[] args) {
        AlunoAcademia aluno = new AlunoAcademia("Renato Cariani", "20060003", "PREMIUM", 10, true);
        System.out.println(aluno);

        aluno.registrarAula();
        aluno.registrarAula();
        aluno.registrarAula();
        System.out.println(aluno);

        aluno.suspenderMensalidade();
        System.out.println(aluno);

        aluno.registrarAula();

        aluno.renovarMensalidade();
        System.out.println(aluno);

        aluno.suspenderMensalidade();
        aluno.suspenderMensalidade();

        aluno.renovarMensalidade();
        aluno.renovarMensalidade();
    }
}