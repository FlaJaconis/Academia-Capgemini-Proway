package exerc_revisao.atp24;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "\nCarro: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa;
    }
}
