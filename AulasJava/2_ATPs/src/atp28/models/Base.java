package exerc_revisao.atp28.models;

public class Base {
    public int id;


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base entraId = (Base) obj;
            if (this.id == entraId.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + id;
    }
}
