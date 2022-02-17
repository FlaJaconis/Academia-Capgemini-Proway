package exerc_revisao.atp26;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa) {
            Pessoa pessoaNova = (Pessoa) obj;
            if (this.nome.equals(pessoaNova.nome) && this.sobrenome.equals(pessoaNova.sobrenome)
                    && this.idade == (pessoaNova.idade)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Sobrenome: " + sobrenome + "Idade: " + idade;
    }
}
