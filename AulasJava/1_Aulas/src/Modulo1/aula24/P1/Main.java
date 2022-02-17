package modulo2.aula24.P1;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();

        Pessoa p1 = new Pessoa();
        p1.nome = "Inês";
        p1.sobrenome = "Calypso";
        p1.idade = 32;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Inês";
        aluno1.sobrenome = "Calypso";
        aluno1.idade = 32;
        aluno1.matricula = "acfaffafa";
        aluno1.curso = "kkkkkkk";
        aluno1.turma = "bbbbbbb";

        Pessoa p2 = new Pessoa();
        p2.nome = "Inês";
        p2.sobrenome = "Calypso";
        p2.idade = 32;

        boolean existe = dados.existe(p2);

        // ou
        // System.out.println(dados.existe(p2));
        dados.remove(aluno1);
        System.out.println(dados.existe(aluno1));
    }
}
