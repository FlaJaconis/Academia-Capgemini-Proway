package modulo2.aula09;

import java.util.Scanner;

public class a9_2_exercicio_metodos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        titulo();
        double n1, n2;
        n1 =  ler_num("\nDigite o primeiro número: ");
        n2 =  ler_num("\nDigite o segundo número: ");
        double r1 = soma(n1, n2);
        double r2 = subtracao(n1, n2);
        double r3 = multiplicacao(n1, n2);
        double r4 = divisao(n1, n2);

       System.out.printf("\n======== Resultado das operações entre %.2f e %.2f ========" +
                "\nSoma =  %.2f " +
                "\nSubtração =  %.2f" +
                "\nMultiplicação =  %.2f" +
                "\nDivisão =  %.2f", n1, n2, r1, r2, r3, r4);
    }

    static void titulo (){
        System.out.println("\n======== Escolha dois números para obter o resultado das operações básicas ========");
    }

    static double ler_num(String mensagem){
        System.out.println(mensagem);

        // é possível retornar sem a variável
        return Double.parseDouble(sc.nextLine());

    }

    static double soma(double num1, double num2 ){
        double result = num1 + num2;
        return result;
    }

    static double subtracao(double num1, double num2 ){
        double result = num1 - num2;
        return result;
    }

    static double multiplicacao(double num1, double num2 ){
        double result = num1 * num2;
        return result;
    }

    static double divisao(double num1, double num2 ){
        double result = num1 / num2;
        return result;
    }
}

