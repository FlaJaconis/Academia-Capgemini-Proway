package exerc_revisao2.atp_R06;

import java.util.Date;

public class Linguagem {
    private String nome;
    private String dataCriacao;
    private char pOO;
    private String tipoLinguagem;

    public void setNome(String entraNome){
        this.nome = entraNome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setDataCriacao(String entDataCriacao){
        this.dataCriacao = entDataCriacao;
    }
    public String getDataCriacao(){
        return this.dataCriacao;
    }

    public void setpOO(char poo) {
        this.pOO = poo;
    }
    public char getPOO(){
        return this.pOO;
    }

    public void setTipoLinguagem(String entraLinguagem) {
        this.tipoLinguagem = entraLinguagem;
    }
    public String getTipoLinguagem() {
        return this.tipoLinguagem;
    }

    @Override
    public String toString() {
        
        return "Nome: " + nome + 
        "\nData de criação: " + dataCriacao +
        "\nProgramação orientada a objeto? " + dataCriacao +
        "\nTipo de linguagem: " + tipoLinguagem;
    }
    
    
}
