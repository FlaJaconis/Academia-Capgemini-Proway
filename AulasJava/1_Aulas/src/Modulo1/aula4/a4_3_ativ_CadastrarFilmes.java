package modulo1.aula4;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class a4_3_ativ_CadastrarFilmes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("********** Organize sua diversão **********");
        System.out.println("\nDigite:" +
                "\n1 - Cadastro de documentários; " +
                "\n2 - Cadastro de filmes; " +
                "\n3 - Cadastro de séries" +
                "\n0 - Sair");

        short cadastro = sc.nextShort();

        switch (cadastro){
            case 0:
                System.out.printf("Sua opção foi %d", cadastro);
                System.out.printf("\nSaindo ... \n");
                break;
            case 1:
                System.out.printf("Sua opção foi %d", cadastro);
                System.out.printf("\nDigite o nome do documentário: \n");
                String docnome = sc.next();
                sc.nextLine();
                System.out.printf("\nDigite o tema do documentário: \n");
                String doctema = sc.next();
                sc.nextLine();
                System.out.printf("\nDigite o ano de lançamento: \n");
                int docano = sc.nextInt();
                sc.nextLine();
                System.out.printf("Você cadastrou %s, gênero: %s e ano: %d! Cadastro realizado com sucesso!"
                        , docnome, doctema, docano );
                sc.nextLine();
                break;
            case 2:
                System.out.printf("Sua opção foi %d", cadastro);
                System.out.printf("\nDigite o nome do filme: \n");
                String filnome = sc.next();
                sc.nextLine();
                System.out.printf("\nDigite o gênero: \n");
                String filgen = sc.next();
                sc.nextLine();
                System.out.printf("\nDigite o ano de lançamento: \n");
                int filano = sc.nextInt();
                sc.nextLine();
                System.out.printf("Você cadastrou %s, gênero: %s e ano: %d! Cadastro realizado com sucesso!",
                        filnome, filgen, filano);
                sc.nextLine();
                break;
            case 3:
                System.out.printf("Sua opção foi %d", cadastro);
                System.out.printf("\nDigite o nome da série: \n");
                String sernome = sc.next();
                sc.nextLine();
                System.out.printf("\nDigite o nome da produtora: \n");
                String serprodut = sc.next();
                sc.nextLine();
                System.out.printf("\nDigite o ano de lançamento: \n");
                int serano = sc.nextInt();
                sc.nextLine();
                System.out.printf("Você cadastrou %s, gênero: %s e ano: %d! Cadastro realizado com sucesso!",
                        sernome, serprodut, serano);
                sc.nextLine();
                break;
            default:
                System.out.println("Opção inválida. Digite novamente!");
                break;
        }
    }
}
