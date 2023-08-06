import java.util.Scanner;

public class Main_ {
    public static void main(String[] args) {
        cabecalho();
        
        validaOpcao();
      
    }
    

    static void cabecalho(){
        System.out.println("********* BRADESCO FINANCIAMENTOS ***********");
        System.out.println("************ Seja bem-vindo(a)! *************");
    }

    static void exibirMenu(){
        System.out.println("+-------------------------------------------+");
        System.out.println("|          Escolha uma opção:               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Crédito Pessoal                       |");
        System.out.println("| 2 - Crédito Imobiliário                   |");
        System.out.println("| 3 - Crédito Empresarial                   |");
        System.out.println("| 4 - Empréstimo Consignado                 |");
        System.out.println("+-------------------------------------------+");
    }
    static void validaOpcao(){
        Scanner sc = new Scanner(System.in);
        Byte opcao;
        char continua = 'N';
        do {
            exibirMenu();
            opcao = Byte.parseByte(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.printf("Você escolheu a opção %d - Crédito Pessoal.", opcao);
                break;
                case 2:
                    System.out.printf("Você escolheu a opção %d - Crédito Imobiliário.", opcao);
                break;
                case 3:
                    System.out.printf("Você escolheu a opção %d - Crédito Empresarial.", opcao);
                break;
                case 4:
                    System.out.printf("Você escolheu a opção %d - Empréstimo Consignado.", opcao);
                break;
                default:
                    System.out.println("Opção inválida, digite novamente!");
                break;
            }

            if(opcao > 0 && opcao <= 4 ){
                do{
                    System.out.print("Para voltar digite V e para sair digite S:");
                    continua = sc.nextLine().toUpperCase().charAt(0);    
                }while(continua!='V' && continua!='S');
            }

               if( continua == 'S') {
                System.out.println("Saindo do programa");;
            }

        }while( opcao < 1 || opcao > 4 || continua == 'V');

        sc.close();
    }
}
