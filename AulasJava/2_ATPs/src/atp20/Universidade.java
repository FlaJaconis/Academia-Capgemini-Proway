package exerc_revisao.atp20;

public class Universidade {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("João Luiz");
        f1.setSobrenome("Medeiros");
        f1.setMatricula(1234);
        f1.setSalario(2000.00);
        f1.setDepartamento("Educativo");

        Coordenador c1 = new Coordenador();
        c1.setNome("Maria Luíza");
        c1.setSobrenome("da Silva");
        c1.setMatricula(5678);
        c1.setSalario(4000.00);
        c1.setDepartamento("Coordenação Pedagógica");
        c1.setCursoCoordenado("Desenvolvimento de Sistemas");
        c1.setBonus(2);

        Aluno a1 = new Aluno();
        a1.setNome("Luana");
        a1.setSobrenome("Gonçalves");
        a1.setMatricula(1456);
        a1.setCurso("Desenvolvimento de Sistemas");
        a1.setTurma("Turma D - 1º semestre");

        System.out.println("***************** UNIVERSIDADE CAPGEMINI *****************");
        System.out.println("**************** Cadastro de Funcionários ****************");
        System.out.println();
        System.out.printf("Funcionária(o): %s %s\n", f1.getNome(), f1.getSobrenome());
        System.out.printf("Matrícula: %d\n", f1.getMatricula());
        System.out.printf("Salário: %.2f\n", f1.getSalario());
        System.out.printf("Departamento: %s\n", f1.getDepartamento());

        System.out.println("------------------------");

        System.out.printf("Coordenadora(o): %s %s\n", c1.getNome(), c1.getSobrenome());
        System.out.printf("Matrícula: %d\n", c1.getMatricula());
        System.out.printf("Salário: %.2f\n", c1.getSalario());
        System.out.printf("Departamento: %s\n", c1.getDepartamento());
        System.out.printf("Curso que coordena: %s\n", c1.getCursoCoordenado());
        System.out.printf("Bônus anual: %.2f por cento\n\n", c1.getBonus());

        System.out.println("******************* Cadastro de Alunos *******************");
        System.out.printf("Aluna(o): %s %s\n", a1.getNome(), a1.getSobrenome());
        System.out.printf("Matrícula: %d\n", a1.getMatricula());
        System.out.printf("Curso: %s\n\n", a1.getCurso());

        System.out.println("***********************************************************");
    }
}
