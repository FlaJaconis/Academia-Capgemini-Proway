package modulo2.aula14_heranca.p1;

public class TelaPrincipal {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Maria fofoqueira");
        System.out.println(pf.getNome());


        Moto m = new Moto();
        m.marca = "honda";

        Carro car = new Carro();
        car.marca = "Fiat";
    }
}
