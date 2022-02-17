package exerc_revisao.atp28.models;

public class PessoaJuridica extends Pessoa {
    public String cnpj;

    @Override
    public String toString() {
        return super.toString() +  "\nCNPJ: " + cnpj;
    }
    
}

