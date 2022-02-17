package modulo2.aula09.exercicios;

import java.util.Scanner;

public class exerc_Salario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======= Avaliação de salário ========");
        double salario;
        do {
            System.out.println("Digite seu salário: ");
            salario = Double.parseDouble(sc.nextLine());

            if (salario <= 0) {
                System.out.println("Salário menor ou igual a zero. Digite novamente!");
                salario = Double.parseDouble(sc.nextLine());
            }
        }
            while (salario <= 0) ;
            if(salario > 5399.99){
                System.out.println("Salário maior que R$ 5399,99.");
            }
            else if (salario > 1997.58) {
                System.out.println("Salário maior que R$ 1997,58.");

            } else {
                System.out.println("Salário entre 0 e R$ 1997,58.");
            }
        }
    }


