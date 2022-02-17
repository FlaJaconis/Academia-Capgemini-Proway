package exerc_revisao2.atp_R06;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Linguagem lg1 = new Linguagem();
        
        System.out.print("\nDigite o nome da linguagem: ");
        String entraNome = sc.nextLine();
        lg1.setNome(entraNome);
        
        System.out.print("\nDigite a data de criação da linguagem: ");
        String entDataCriacao = sc.nextLine();
        lg1.setDataCriacao(entDataCriacao);

        System.out.print("\nÉ uma linguagem orientada a objeto? Digite S/sim ou N/não: ");
        char poo = sc.nextLine().toUpperCase().charAt(0);
        lg1.setpOO(poo);

        System.out.print("\nDigite o tipo da linguagem: ");
        String entraLinguagem = sc.nextLine();
        lg1.setTipoLinguagem(entraLinguagem);

        System.out.println("\n-------------------+ Descrição da linguagem +-------------------");
        System.out.println(lg1);
    }
}
