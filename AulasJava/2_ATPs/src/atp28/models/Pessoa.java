package exerc_revisao.atp28.models;

public class Pessoa extends Base{
    public String nome;
    public Endereco endResidencial;
    public Endereco endComercial;

    public Pessoa(){
        endResidencial = new Endereco();
        endComercial = new Endereco();
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNome: " + nome;
    }
}
