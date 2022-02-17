package modulo2.aula09.exercicios;

import java.util.Scanner;

public class exercATP10 {
    static Scanner sc = new Scanner(System.in);
    byte idade = 0;
    public static void main(String[] args) {
        System.out.println("=========== CADASTRO USUÁRIO ===========");
        System.out.println("_____________ Bem-vindo(a)!_____________");
        System.out.print("Digite sua idade: ");
        byte idade = Byte.parseByte(sc.nextLine());

        if(idade>25){
            System.out.printf("Idade maior que 25 anos!");
        }else if (idade==25){
            System.out.printf("Idade igual a 25 anos!");
        }else {
            System.out.printf("Idade menor que 25 anos!");
        }
    }
}

