package atp29_dupla.view;

import java.util.Scanner;

import atp29_dupla.controllers.BaseController;
import atp29_dupla.controllers.ProdutoController;
import atp29_dupla.models.Categorias;
import atp29_dupla.models.Produtos;

public class Main {
    public static void main(String[] args) {

        ProdutoController pc = new ProdutoController();
        int op;

       
        do{
            System.out.println("====================== CADASTRO DE PRODUTOS ======================");
            op = Menu();
            Switch(op, pc);
            System.out.println("------------------------------------------------------------------");
        }while(op >= 1 && op<5);
    }

    static public int Menu() {
        int op;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscolha: " +
                            "\n1 - Cadastrar;"+
                            "\n2 - Deletar;"+
                            "\n3 - Atualizar;"+
                            "\n4 - Listar;" +
                            "\n5 - Sair\n" +
                            "\nOpção: \n");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }

    static public void Switch(int op, ProdutoController pc) {
        Scanner sc = new Scanner(System.in);

        switch (op) {
        case 1:
            pc.create(adicionar());
            break;

        case 2:
            System.out.println("Digite o ID a ser deletado: ");
            int entraId = Integer.parseInt(sc.nextLine());
            Produtos p = new Produtos();
            p.id = entraId;
            pc.delete(p);
            break;

        case 3:
            pc.update(adicionar());
            break;

        case 4:
            pc.listar(pc.read());
            break;

        case 5:
            System.out.println("Saindo... ");
            break;
        }
    }

    static public Produtos adicionar() {
        Produtos p = new Produtos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a categoria do produto: ");
        p.cat.tipo = sc.nextLine();

        System.out.println("Digite o id do produto: ");
        p.id = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o nome do produto: ");
        p.nome = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        p.valor = Double.parseDouble(sc.nextLine());

        return p;
    }
}
