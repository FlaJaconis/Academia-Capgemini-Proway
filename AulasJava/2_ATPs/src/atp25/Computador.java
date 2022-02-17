package exerc_revisao.atp25;

public class Computador {
    public String marca;
    public String memoriaRam;
    public String processador;
    public String hd;
    
    @Override
    public String toString() {
        return "\nCOMPUTADOR +++++++++++++++++" + "\nMarca: " + marca +
                "\nMemoria Ram: " + memoriaRam +
                "\nProcessador: " + processador +
                "\nHD: " + hd  +
                "\n_____________________________________________________";
    }
}
