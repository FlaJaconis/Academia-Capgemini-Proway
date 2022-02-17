package exerc_revisao.atp23_precisa_terminar.view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import exerc_revisao.atp23_precisa_terminar.controller.ControllerLivros;
import exerc_revisao.atp23_precisa_terminar.model.Livros;

public class ViewLivros {
    public static void main(String[] args) {

        ControllerLivros cl = new ControllerLivros();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        menu(sc);

        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    cadastrar(cl);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (opcao >= 1 && opcao <= 4);
    }

    public static int menu(Scanner sc) {
        System.out.println(
                "Escolha: " + "\n1 - Cadastrar;" + "\n2 - Listar;" + "\n3 - Deletar;" + "\n4 - Atualizar;" + "Opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    public static void cadastrar(ControllerLivros lv) {
        Livros livro1 = new Livros(id);
        livro1.setTitulo("A Revolta da Vacina");
        livro1.setAutor("Nicolau Sevcenko");
        livro1.setAnoPublicacao(1984);
        livro1.setGenero("História do Brasil");
        livro1.setStatus("Emprestado");
        lv.salvar(livro1);
    }
}
