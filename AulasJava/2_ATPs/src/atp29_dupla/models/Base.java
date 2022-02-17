package atp29_dupla.models;

public class Base {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base){
            Base b = (Base) obj;
            if (this.id == b.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID: " + id;
    }

    
}
