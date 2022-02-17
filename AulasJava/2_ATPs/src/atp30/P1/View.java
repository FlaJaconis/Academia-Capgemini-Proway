package exerc_revisao.atp30.P1;

import java.util.Scanner;

public class View {

    static Scanner sc = new Scanner(System.in);
    static Calculadora calc = new Calculadora();

    public static void main(String[] args) {
        int op = 0;
        do {
            try {
                System.out.print("\nDigite o primeiro número: ");
                int num1 = Integer.parseInt(sc.nextLine());

                System.out.print("\nDigite o segundo número: ");
                int num2 = Integer.parseInt(sc.nextLine());

                op = Menu();
                Cases(op, num1, num2);

            } catch (Exception e) {
                System.out.println("Opção inválida!!");
            }
        } while (op != 5);
    }

    public static int Menu() {

        System.out.print("\nEscolha:" + "\n1 - Somar;" + "\n2 - Subtrair;" + "\n3 - Multiplicar;" + "\n4 - Dividir"
                + "\n5- Sair;" + "\n\nOpção: ");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

     public static void Cases(int op, int num1, int num2) {

        int resultado1, resultado2, resultado3;
        double resultado4;

        switch (op) {
        case 1:
        System.out.println("======================= Soma =======================");
            resultado1 = calc.Somar(num1, num2);
            System.out.printf("O resultado da soma é %d", resultado1);
            break;

        case 2:
        System.out.println("======================= Subtração =======================");
            resultado2 = calc.Subtrair(num1, num2);
            System.out.printf("O resultado da subtração é %d", resultado2);
            break;

        case 3:
        System.out.println("======================= Multiplicação =======================");
            resultado3 = calc.Multiplicar(num1, num2);
            System.out.printf("O resultado da multiplicação é %d", resultado3);
            break;

        case 4:
        System.out.println("======================= Divisão =======================");
            resultado4 = calc.Dividir(num1, num2);
            System.out.printf("O resultado da divisão é %f", resultado4);
            break;

        case 5:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida. Digite uma opção entre 1 e 5.");
            break;
        }
    }
}