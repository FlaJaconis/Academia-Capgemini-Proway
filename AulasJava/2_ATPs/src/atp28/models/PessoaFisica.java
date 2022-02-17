package exerc_revisao.atp28.models;

public class PessoaFisica extends Pessoa{
    
    public String sobrenome;
    public String cpf;

    @Override
    public String toString() {
        return super.toString() +  "\nSobrenome: " + sobrenome + 
        "\nCPF: " + cpf + "Endereço: " + endResidencial.logradouro;
    }
    
}
