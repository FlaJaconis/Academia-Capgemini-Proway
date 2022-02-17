package exerc_revisao.atp22.Aluno;

public class Tela {
    public static void main(String[] args) {
        Aluno al1 = new Aluno();
        al1.setNomeCompleto("Flávia Jaconis");
        al1.setIdade(40);
        al1.setMatricula(123);

        Aluno al2 = new Aluno();
        al2.setNomeCompleto("Natália Nunes");
        al2.setIdade(38);
        al2.setMatricula(456);

        System.out.println(al1);
        System.out.println(al2);
    }
}
