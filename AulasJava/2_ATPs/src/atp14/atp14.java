package exerc_revisao;

import java.util.Scanner;

public class atp14 {

    private static Scanner sc;

    public static void main(String[] args) {
        cabecalho();
        menu();
        validaOpcao();
    }

    static void cabecalho() {
        System.out.println("\n======= CALCULADORA ======= ");
    }

    static void menu() {
        System.out.println(
                "Escolha uma operação:" + "\n1 - somar;" + "\n2 - subtrair;" + "\n3 - multiplicar;" + "\n4 - dividir;");
    }

    static void validaOpcao() {
        Scanner sc = new Scanner(System.in);
        short opcao = Short.parseShort(sc.nextLine());

        if (opcao < 1 || opcao > 4) {
            System.out.println("\nOpção inválida! Digite uma opção entre 1 e 4.");
            menu();
            validaOpcao();
        } else {
            double num1 = ler_numero("Digite o primeiro número: ");
            double num2 = ler_numero("Digite o segundo número: ");

            switch (opcao) {
                case 1:
                    double resSoma = somar(num1, num2);
                    System.out.printf("A soma é: %.2f", resSoma);
                    break;
                case 2:
                    double resSub = subtrair(num1, num2);
                    System.out.printf("A subtrair é: %.2f", resSub);

                    break;
                case 3:
                    double resMult = mult(num1, num2);
                    System.out.printf("A multiplicação é: %.2f", resMult);

                    break;
                case 4:
                    double resDiv = div(num1, num2);
                    System.out.printf("A divisão é: %.2f", resDiv);

                    break;
            }
        }
    }

    static double ler_numero(String mensagem) {
        sc = new Scanner(System.in);
        System.out.println(mensagem);
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }

    static double somar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    static double subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    static double mult(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }

    static double div(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }
}
