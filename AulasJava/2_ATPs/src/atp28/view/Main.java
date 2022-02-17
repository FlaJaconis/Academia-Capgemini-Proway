package exerc_revisao.atp28.view;

import exerc_revisao.atp28.controllers.PFisicaController;
import exerc_revisao.atp28.controllers.PJuridicaController;
import exerc_revisao.atp28.models.Endereco;
import exerc_revisao.atp28.models.PessoaFisica;
import exerc_revisao.atp28.models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {

        PFisicaController pfc = new PFisicaController();
        PJuridicaController pjc = new PJuridicaController();

        PessoaFisica pf1 = new PessoaFisica();
        pf1.id = 01;
        pf1.nome = "Flávia Jaconis";
        pf1.cpf = "222222222222";
        pf1.endResidencial.logradouro = "Alameda Santos";
        pf1.endResidencial.numero = 1000;
        pf1.endResidencial.bairro = "Vila Medeiros";
        pf1.endResidencial.cep = 123456 ;
        pf1.endResidencial.cidadeEstado = "São Paulo/SP"; 

        PessoaFisica pf2 = new PessoaFisica();
        pf2.id = 02;
        pf2.nome = "João Pedro da Silva";
        pf2.cpf = "1111111111111";
        pf2.endResidencial.logradouro = "Alameda Jaú";
        pf2.endResidencial.numero = 10;
        pf2.endResidencial.bairro = "Cerqueira César";
        pf2.endResidencial.cep = 458760 ;
        pf2.endResidencial.cidadeEstado = "São Paulo/SP"; 

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.id = 03;
        pj1.nome = "DesenvolveSistem";
        pj1.cnpj = "0000000000000";
        pj1.endResidencial.logradouro = "Brasil";
        pj1.endResidencial.numero = 1000;
        pj1.endResidencial.bairro = "Jardim Violeta";
        pj1.endResidencial.cep = 345678 ;
        pj1.endResidencial.cidadeEstado = "São Paulo/SP"; 

        System.out.println("\n+----------------- CADASTRO DE PESSOA -----------------+");
        pfc.create(pf1);
        System.out.println(pf1);
        System.out.printf("Pessoa cadastrada com sucesso!\n");
        pfc.create(pf2);
        System.out.println(pf2);
        System.out.printf("Pessoa cadastrada com sucesso!\n");

        pjc.create(pj1);
        System.out.println(pj1);
        System.out.printf("Pessoa cadastrada com sucesso!\n");

        System.out.println("\n+----------------- CADASTRO DE PESSOA -----------------+");
        System.out.println("+---------------------- Listagem ----------------------+\n");

        listar(pjc);
        listar(pfc);

        pfc.delete(pf2);

        System.out.println("\n+----------------- CADASTRO DE PESSOA -----------------+\n");
        System.out.println("\n+---------------------- Listagem ----------------------+\n");

        listar(pjc);
        listar(pfc);

        System.out.println("\n+---------------------------------------------------------------+\n");
    }

    static public void listar(Object obj) {
        if (obj instanceof PFisicaController) {
            PFisicaController controllerpf = (PFisicaController) obj;
            for (PessoaFisica pessoaF : controllerpf.read()) {
                System.out.println(pessoaF);
            }
        } else if (obj instanceof PJuridicaController) {
            PJuridicaController controllerpj = (PJuridicaController) obj;
            for (PessoaJuridica pessoaJ : controllerpj.read()) {
                System.out.println(pessoaJ);
            }
        }
    }
}
