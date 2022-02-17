package atp29_dupla.models;

public class Produtos extends Base {
    public Categorias cat;
    public String nome;
    public double valor;

    public Produtos(){
        cat = new Categorias();
    }



    @Override
    public String toString() {
        return super.toString() + "Nome: " + nome + "Valor: " + valor;
    }
}
