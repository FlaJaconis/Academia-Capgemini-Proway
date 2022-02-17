package exerc_revisao.atp26;

import exerc_revisao.atp26.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Flá";
        pessoa1.sobrenome = "Nunes";
        pessoa1.idade = 40;
    
        
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Flávia";
        aluno1.sobrenome = "Jaconis";
        aluno1.idade = 40;
        aluno1.matricula = 123;
        aluno1.turma = "Java D";
        aluno1.curso = "Desenvolvimento de Sistemas";

        Dados obj1 = new Dados();

        System.out.println("========= Cadastro de Alunos =========");

        System.out.println(obj1.adiciona(pessoa1));
        System.out.println(obj1.adiciona(aluno1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Flá";
        pessoa2.sobrenome = "Nunes";
        pessoa2.idade = 30;
        System.out.println(obj1.adiciona(pessoa2));
        
        System.out.println(obj1.verificar(pessoa2));
        System.out.println(obj1.remover(aluno1));

    }
}
