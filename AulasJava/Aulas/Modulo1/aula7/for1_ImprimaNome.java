package modulo1.aula7;

import java.util.Scanner;

public class for1_ImprimaNome {
    public static void main(String[] args) {
        int cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu nobrenome: ");
        String sobrenome = sc.nextLine();

        while (cont < 10){
            cont ++;
            System.out.printf("O seu nome é %s %s\n", nome, sobrenome);
        }
        for (int i=0; i < 10; i++){
            System.out.printf("O seu nome é %s %s\n", nome, sobrenome);
        }
    }
}
