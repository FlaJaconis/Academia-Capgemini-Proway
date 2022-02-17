package exerc_revisao.atp19;

public class CadastroPessoas {
    public static void main(String[] args) {
        PessoaFisica[] pessoa = new PessoaFisica[5];

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Flávia Jaconis");
        p1.setIdade(40);

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Sonia Maria");
        p2.setIdade(65);

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Vânia Jaconis");
        p3.setIdade(39);

        PessoaFisica p4 = new PessoaFisica();
        p4.setNome("Ravenna Jaconis");
        p4.setIdade(16);

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Cleo Jaconis");
        p5.setIdade(11);

        pessoa[0] = p1;
        pessoa[1] = p2;
        pessoa[2] = p3;
        pessoa[3] = p4;
        pessoa[4] = p5;

        System.out.println("****************** CADASTRO DE PESSOAS ******************");

        for (PessoaFisica pFisica : pessoa) {
            System.out.printf("O nome da pessoa é %s e sua idade é %d.\n", pFisica.getNome(), pFisica.getIdade());
        }
        System.out.println("*********************************************************");

    }

}
