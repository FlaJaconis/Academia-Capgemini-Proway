package exerc_revisao.atp24;

public class Carro extends Veiculo{
    public int numPortas;
    public String portaMalas;

    @Override
    public String toString() {
        return "\nCarro: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nPortas: " + numPortas + "\nPorta-malas: " + portaMalas;
    }
}
