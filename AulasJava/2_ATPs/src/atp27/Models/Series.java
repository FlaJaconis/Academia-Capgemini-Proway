package exerc_revisao.atp27.Models;

public class Series extends Base {
    public int temporada;

    @Override
    public String toString() {
        return super.toString() + "\nTemporada: " + temporada;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Series) {
            Series serieNova = (Series) obj;
            if (this.id == serieNova.id) {
                return true;
            }
        }
        return false;
    }
}
