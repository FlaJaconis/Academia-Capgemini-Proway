package exerc_revisao.atp25;

public class Notebook extends Computador {
    public String bateria;
    public String velWifi;
    public String bluetooth;

    @Override
    public String toString() {
        return "\nNOTEBOOK +++++++++++++++++" + "\nMarca: " + marca +
                "\nMemoria Ram: " + memoriaRam +
                "\nProcessador: " + processador +
                "\nHD: " + hd +
                "\nBateria: " + bateria +
                "\nMonitor: " + velWifi +
                "\nBluetooth: " + bluetooth +
                "\n_____________________________________________________";
    }
}
