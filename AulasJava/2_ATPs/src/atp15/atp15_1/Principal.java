package exerc_revisao.atp15;

public class Principal {
    
    public static void main(String[] args) {

        System.out.println("=================== Cadastro Pessoa ===================");
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.sobrenome = "da Silva";
        p1.idade = 40;

        Pessoa p2 = new Pessoa();
        p2.nome = "Luíza";
        p2.sobrenome = "Santos";
        p2.idade = 36;

        System.out.printf("\nO nome da primeira pessoa é %s %s e a idade é %d anos.\n", p1.nome, p1.sobrenome, p1.idade);
        System.out.printf("\nO nome da segunda pessoa é %s %s e a idade é %d anos.\n", p2.nome, p2.sobrenome, p2.idade);
    }
}
