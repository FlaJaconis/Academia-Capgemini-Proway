package exerc_revisao.atp25;

public class Desktop extends Computador {
    public String gabinete;
    public String monitor;
    public String fonte;

    @Override
    public String toString() {
        return "\nDESKTOP +++++++++++++++++" + "\nMarca: " + marca +
                "\nMemoria Ram: " +  memoriaRam +
                "\nProcessador: " + processador +
                "\nHD: " + hd +
                "\nGabinete: " + gabinete +
                "\nMonitor: " + monitor +
                "\nFonte: " + fonte +
                "\n_____________________________________________________";
    }
}
