package exerc_revisao.atp25;

public class Main {
    public static void main(String[] args) {

        Computador comp1 = new Computador();
        comp1.marca = "Dell";
        comp1.memoriaRam = "8 Gb";
        comp1.processador = "Intel Core I5";
        comp1.hd = "500 Gb";

        Notebook note1 = new Notebook();
        note1.marca = "Vayo";
        note1.memoriaRam = "16 Gb";
        note1.processador = "Intel Core I7";
        note1.hd = "256 Gb";
        note1.bateria = "Bateria de 3 células e 42 WHr (Integrada)";
        note1.bluetooth = "Sim";

        Desktop desk1 = new Desktop();
        desk1.marca = "Lenovo";
        desk1.memoriaRam = "4 Gb";
        desk1.processador = "Intel Core I3";
        desk1.hd = "256 Gb";
        desk1.fonte = "35W";
        desk1.gabinete = "Torre completa";
        desk1.monitor = "27 polegadas";

        Object obj1 = comp1;
        Object obj2 = note1;
        Object obj3 = desk1;

        Computador comp2 = (Computador) obj1;
        Notebook note2 = (Notebook) obj2;
        Desktop desk2 = (Desktop) obj3;

        System.out.println("================== Computadores em estoque ==================");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
