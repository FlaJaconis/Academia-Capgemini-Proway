package exerc_revisao.atp27.Models;

public class Filmes extends Base{
    public int anoLancamento; 
    
    @Override
    public String toString() {
        return super.toString() +"\nAno de Lançamento: " + anoLancamento;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Filmes) {
            Filmes filmeNovo = (Filmes) obj;
            if (this.id == filmeNovo.id) {
                return true;
            }
        }
        return false;
    }
}
    

