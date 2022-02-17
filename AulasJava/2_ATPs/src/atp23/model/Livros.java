package exerc_revisao.atp23_precisa_terminar.model;

import exerc_revisao.atp23_precisa_terminar.model.BaseLivros;

public class Livros extends BaseLivros {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String status;

    public Livros(int entraid) {
        super(entraid);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String entraAutor) {
        this.autor = entraAutor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {

        return "\nLivro: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + anoPublicacao + "\nGênero: "
                + genero + "\nStatus: " + status;
    }

    @Override
    public boolean equals(Object obj) {
       Livros livro = (Livros)obj;
       if(this.getId() == livro.getId()){
        return true;
       }else{
           return false;
       }
    }
}
