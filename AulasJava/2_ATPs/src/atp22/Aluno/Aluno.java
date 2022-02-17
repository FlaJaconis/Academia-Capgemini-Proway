package exerc_revisao.atp22.Aluno;

public class Aluno {
    private String nomeCompleto;
    private int idade;
    private int matricula;

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        System.out.println("********************* CADASTRO DE ALUNOS *********************");
        String dadosPessoa = "Nome do aluno: " + this.nomeCompleto + "\nIdade: " + this.idade 
        + "\nMatrícula: " + this.matricula + "\n";
        return dadosPessoa;
    }
}
