package exerc_revisao.atp24;

//Crie uma classe veiculo com atributos públicos: marca, modelo e placa.
//_  Crie uma classe carro com os atributos públicos: número de portas e capacidade do porta-malas.
//_  Crie uma classe Main com um método main.
//_  Crie um objeto de classe Veículo e uma de classe Carro e atribua valores para as propriedade de cada objeto.
//_  Crie um objeto da classe Object através da instância da classe Veículo.
//_  Crie um objeto da classe Object através da instância da classe Carro.
//Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
//_  Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.
//_  Imprima todos dos dados do objeto de Veículo convertido.
//_  Imprima todos dos dados do objeto de Carro convertido.

public class Main {
    public static void main(String[] args) {
        
        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca = "Toyota";
        veiculo1.modelo = "carro esportivo";
        veiculo1.placa = "car2021";

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "cross";
        carro1.placa = "cro2021";
        carro1.numPortas = 4;
        carro1.portaMalas = "420 l";

        Object obj1 = veiculo1;
        Object obj2 = carro1;

        Veiculo veiculo2 = (Veiculo)obj1;
        Carro carro2 = (Carro)obj2;

        System.out.println(veiculo2);
        System.out.println(obj2);
    }
}
