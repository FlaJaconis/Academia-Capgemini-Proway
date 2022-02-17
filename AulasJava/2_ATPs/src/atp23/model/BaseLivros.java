package exerc_revisao.atp23_precisa_terminar.model;


public abstract class BaseLivros {
    private int id;

    public BaseLivros(int entraid) {
        this.id = entraid;
    }

    public int getId() {
        return this.id;
    }
}