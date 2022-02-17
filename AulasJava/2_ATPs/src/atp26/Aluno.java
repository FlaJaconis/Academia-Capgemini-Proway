package exerc_revisao.atp26;

public class Aluno extends Pessoa {
    public int matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            Aluno alunoNovo = (Aluno) obj;
            if (this.turma.equals(alunoNovo.turma) && this.curso.equals(alunoNovo.curso)
                    && this.matricula == (alunoNovo.matricula)) {
                return true;

            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Matrícula: " + matricula + "Turma: " + turma + "Curso: " + curso;
    }
}
