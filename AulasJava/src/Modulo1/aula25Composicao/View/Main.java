package modulo2.aula25Composicao.View;

import modulo2.aula25Composicao.models.PessoaFisica;
import modulo2.aula25Composicao.models.Endereco;
import modulo2.aula25Composicao.models.Pessoa;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.id = 10;
        pf.nome = "Inex";

        Endereco end1 = new Endereco();
        end1.logradouro = "Av JK";
        end1.numero = "123";
        end1.complemento = "31A";
        end1.cep = "56.326-89";
        end1.cidade = "Cidadelândia";
        end1.estado = "Estadolândia";

        pf.enderecoResidencial = end1;
        pf.enderecoComercial = end1;
    }
}
