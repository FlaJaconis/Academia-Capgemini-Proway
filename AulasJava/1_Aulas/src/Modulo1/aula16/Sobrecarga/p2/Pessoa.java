package modulo2.aula16.Sobrecarga.p2;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString(){
        String objetoEmString = this.nome + " " + this.sobrenome;
        return objetoEmString;
    }
    
}
